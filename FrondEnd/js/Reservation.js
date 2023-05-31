function saveEmployee(){
    let nameIn=$('#nameInput').val();
    let emailIn=$('#emailInput').val();
    let numberIn=$('#phoneInput').val();
    let arivalIn=$('#arivalInput').val();
    let depatureIn=$('#depatureInput').val();
    let adultsIn=$('#adultsInput').val();
    let childsIn=$('#childrenInput').val();
    let popup=document.getElementById("popup");


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/resevation/saveResevation",
        async:true,
        data:JSON.stringify({
            "id":"",
            "name": nameIn,
            "email":emailIn,
            "number":numberIn,
            "arival":arivalIn,
            "depature":depatureIn,
            "adults":adultsIn,
            "childs":childsIn,
        }),
    })
    closePopup();
    popup.classList.add("open-popup");


}




function  closePopup(){
    popup.classList.remove("open-popup");
}