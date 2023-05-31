function saveEmployee(){
    let nameIn=$('#nameInput').val();
    let emailIn=$('#emailInput').val();
    let numberIn=$('#phoneInput').val();
    let cuntryIn=$('#countryInput').val();
    let msgIn=$('#msgInput').val();
    let popup=document.getElementById("popup");


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/contact/saveContact",
        async:true,
        data:JSON.stringify({
            "id":"",
            "name": nameIn,
            "email":emailIn,
            "number":numberIn,
            "cuntry":cuntryIn,
            "msg":msgIn,
        }),
    })
    closePopup();
    popup.classList.add("open-popup");


}




function  closePopup(){
    popup.classList.remove("open-popup");
}