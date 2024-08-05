window.onload = function(){
getPrincipal();
loadSurveys();
}

function loadSurveys() {
        fetch("/surveys")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
                fillSurveyTable(jsonData);
            }).catch(error => console.log(error));
}

function fillSurveyTable(surveys) {
    console.log(surveys);
    const surveysTable = document.querySelector("#surveysTable");
    surveysTable.innerHTML = "";

    for(let i = 0;i < surveys.length; i++){
        tr = createRowForSurvey(surveys[i]);
        surveysTable.appendChild(tr);
    }
}

function createRowForSurvey(data){
//
}
