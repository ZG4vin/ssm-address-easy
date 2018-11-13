function xiugaiShow(id){
    $.ajax({
        type:"GET",
        url:"/operation/toEdit",
        data:{id:id},
        success:function (result) {
            $("#id").val(result.id);
            $("#name").val(result.name);
            $("#phone").val(result.phone);
            $("#address").val(result.address);
        }
    })
}
function xiugai(){
    $.ajax({
        type:"GET",
        url:"/operation/add",
        data:{
            id:$("#id").val(),
            name:$("#name").val(),
            phone:$("#phone").val(),
            address:$("#address").val()
        },
        success:function (result) {
            $(".modal-backdrop").remove();
            $("#content").load("/index/toFind");
        }
    })
}
function shanchu(id){
    $(".xiugai").click(
        $.ajax({
            type:"GET",
            url:"/operation/delete",
            data:{id:id},
            success:function (result) {
                $("#content").load("/index/toFind");
            }
        })
    )
}

function clearn() {
    $("#id").val("");
    $("#name").val("");
    $("#phone").val("");
    $("#address").val("");
}