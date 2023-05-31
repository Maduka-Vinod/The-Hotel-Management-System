function saveEmployee(){
    let usernameIn=$('#usernameInput').val();
    let passwordIn=$('#passwordInput').val();
    let popup=document.getElementById("popup");


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/login/saveLogin",
        async:true,
        data:JSON.stringify({
            "id":"",
            "username": usernameIn,
            "password": passwordIn,
        }),
    })
    closePopup();
    popup.classList.add("open-popup");

}

function  closePopup(){
    popup.classList.remove("open-popup");
}