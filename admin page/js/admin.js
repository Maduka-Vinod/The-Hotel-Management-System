
getAllEmployees()
function getAllEmployees(){
    $.ajax({
        method:"GET",
        url:"http://localhost:8080/api/v1/resevation/getResevations",
        async:true,
        success: function (data) {
            $('#adminH').empty();
            for (let emp of data){
                let id=emp.id
                let name=emp.name
                let email=emp.email
                let arival=emp.arival
                let depature=emp.depature
                let number=emp.number

                var row2=`<tr><td>Id</td><td>Name</td><td>Email</td><td>Arival</td><td>Depature</td><td>Number</td></tr>`;
                document.getElementById('adminH').innerHTML = row2
                var row1=`<tr><td>${id}</td><td>${name}</td><td>${email}</td><td>${arival}</td><td>${depature}</td><td>${number}</td></tr>`;
                $('#adminR').append(row1);
            }

        },
        error: function (xhr, exception) {
            alert("Error")
        }
    })
}

function deleteEmployee(){
    let id=$('#studentinput1').val();

    $.ajax({
        method:"DELETE",
        url:"http://localhost:8080/api/v1/resevation/deleteResevation/"+id,
        async:true,
        success: function (data) {
            alert("Deleted")
        },
        error: function (xhr, exception) {
            alert("Error")
        }
    })

}