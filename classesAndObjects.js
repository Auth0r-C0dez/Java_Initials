class Engineer { //creation of class
    constructor () {//syntax for creation of a constructor 
        //a constructor gets invoked or gets executed everytime an object is created.
        console.log("new object creation");
    }
    CSe () {//creation of function within a class
        console.log("it is an engineering course");
    }
    AIML () {//another function
        console.log("it is an engineerng course");
    }
    //we can also create setters in the function as followa
    setCompany(brand) {
        this.job = brand;//here this keyword says that the specific object gets the value
    }
}

//we can create as many objects as we want from the same class
let civil = new Engineer();//creation of object of class engineer.by this object we can acess all the function within the classs
civil.setCompany("technical");//this is the object for whom the function is being called
