window.onload = function(){
    const id = window.location.href.slice(-1);
    getBook(id);
}


function getBook(id) {
        fetch("/book/" + id)
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
                fillBook(jsonData);
            }).catch(error => console.log(error));
}

function fillBook(jsonData){
    console.log(jsonData)

    document.querySelector("#author").innerHTML = jsonData.author;
    document.querySelector("#title").innerHTML = jsonData.title;

}