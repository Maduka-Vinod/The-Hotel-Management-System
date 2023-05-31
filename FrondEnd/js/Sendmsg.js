function saveEmployee(){
    let nameIn=$('#nameInput').val();
    let emailIn=$('#emailInput').val();
    let msgIn=$('#msgInput').val();
    let popup=document.getElementById("popup");


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/sendmsg/saveSendmsg",
        async:true,
        data:JSON.stringify({
            "id":"",
            "name": nameIn,
            "email":emailIn,
            "msg":msgIn,
        }),
    })
    closePopup();
    popup.classList.add("open-popup");


}




function  closePopup(){
    popup.classList.remove("open-popup");
}