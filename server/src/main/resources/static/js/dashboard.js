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
}