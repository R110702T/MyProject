let form = document.querySelector("form");
let input_value = document.getElementById("input_val");
let taskMainEle = document.getElementById("tasks");

form.addEventListener("submit", e => {
    e.preventDefault();
    let taskValue = input_value.value;
    // console.log(taskValue);
    if (!taskValue) {
        alert("Please Add a Task")
    }

    // !create main element task
    let taskEle = document.createElement("div");
    taskEle.classList.add("task");

    //!content ele
    let contentEle = document.createElement("div");
    contentEle.classList.add("content");

    let inputEle = document.createElement("input");
    inputEle.setAttribute("type", "text");
    inputEle.value = taskValue;
    inputEle.id = "text";
    inputEle.setAttribute("readonly", "readonly")

    //!actions
    let actionEle = document.createElement("div");
    actionEle.classList.add("actions")

    let edit_btn=document.createElement("button");
    edit_btn.classList.add("edit");
    edit_btn.innerText="Edit"

    let delete_btn=document.createElement("button");
    delete_btn.classList.add("delete");
    delete_btn.innerText="Delete"

    actionEle.appendChild(edit_btn)
    actionEle.appendChild(delete_btn)
    contentEle.appendChild(inputEle);
    taskEle.appendChild(contentEle)
    taskEle.appendChild(actionEle);
    taskMainEle.append(taskEle);
    input_value.value=""


    //! editing
    edit_btn.addEventListener("click",e=>{
        if(edit_btn.innerText.toLowerCase() == "edit"){
            inputEle.removeAttribute("readonly");
            inputEle.focus();
            edit_btn.innerText="Save"
        }else{
            inputEle.setAttribute("readonly","readonly");
            edit_btn.innerText="Edit"
        }
    })

    //!DELETE
    delete_btn.addEventListener("click",_=>{
        taskMainEle.removeChild(taskEle)
    })
})