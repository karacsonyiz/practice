window.onload = function(){
    getDashboard();
}

function getDashboard(){
        fetch("/dashboard")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                fillDashboardTable(jsonData);
            }).catch(error => console.log(error));
}

function fillDashboardTable(jsonData) {
    console.log(jsonData)
    const tbody = document.querySelector("#dashboardtbody");
        tbody.innerHTML = "";
        for(let i = 0;i < jsonData.length; i++){
            tr = createRowForDashboard(jsonData[i]);
            usersTable.appendChild(tr);
        }
}

function createRowForDashboard(row){
        let tr = document.createElement("tr");
        let bookTd = document.createElement("td");
        bookTd.innerHTML = row.book;
        tr.appendChild(bookTd);
        let userTd = document.createElement("td");
        userTd.innerHTML = row.user;
        tr.appendChild(userTd);
        return tr;
}