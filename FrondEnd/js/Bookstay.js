function saveEmployee(){
    let checkinIn=$('#checkinInput').val();
    let checkoutIn=$('#checkoutInput').val();
    let emailIn=$('#emailInput').val();
    let nationalityIn=$('#nationalityInput').val();
    let promocodeIn=$('#promocodeInput').val();
    let popup=document.getElementById("popup");


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/bookstay/saveBookstay",
        async:true,
        data:JSON.stringify({
            "id":"",
            "checkin": checkinIn,
            "checkout":checkoutIn,
            "email":emailIn,
            "nationality":nationalityIn,
            "promocode":promocodeIn,
        }),
    })
    closePopup();
    popup.classList.add("open-popup");


}




function  closePopup(){
    popup.classList.remove("open-popup");
}