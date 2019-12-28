

    function checkPassword() { 
	var password1=document.getElementById("pass").value;
	var password2=document.getElementById("pword").value;
                //password1 = form.password1.value; 
                //password2 = form.password2.value; 
  
                // If password not entered 
                if (password1 == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (password2 == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (password1 != password2) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
  
                // If same return True. 
                else{ 
                    alert("Password Match") 
                    return true; 
                } 
           } 
  function dobVal()
{
                var d=new Date();


                        var year=d.getFullYear();
                        var mon= d.getMonth()+1;
                        var d=d.getDate();

                                if(d<10)
                                        d='0'+d;
                                        if(mon<10)
                                        mon='0'+mon;
                document.getElementById('bday').min=year+'-'+mon+'-'+d;                 
} 

function showPass(){

var x = document.getElementById("pass");
var y = document.getElementById("pword");

  if (x.type === "password") {
    x.type = "password1";
	y.type="password2";
  } else {
    x.type = "password1";
	y.type="password2";
	
  }
}
 function ValidateDOB() {
        var lblError = document.getElementById("lblError");
 
        var dateString = document.getElementById("txtDate").value;
        var regex = /(((0|1)[0-9]|2[0-9]|3[0-1])\/(0[1-9]|1[0-2])\/((19|20)\d\d))$/;
 
       
        if (regex.test(dateString)) {
            var parts = dateString.split("/");
            var dtDOB = new Date(parts[1] + "/" + parts[0] + "/" + parts[2]);
            var dtCurrent = new Date();
            lblError.innerHTML = "Eligibility 18 years ONLY."
            if (dtCurrent.getFullYear() - dtDOB.getFullYear() < 18) {
                return false;
            }
 
            if (dtCurrent.getFullYear() - dtDOB.getFullYear() == 18) {
 
               
                if (dtCurrent.getMonth() < dtDOB.getMonth()) {
                    return false;
                }
                if (dtCurrent.getMonth() == dtDOB.getMonth()) {
                   
                    if (dtCurrent.getDate() < dtDOB.getDate()) {
                        return false;
                    }
                }
            }
            lblError.innerHTML = "";
            return true;
        } else {
            lblError.innerHTML = "Enter date in dd/MM/yyyy."
            return false;
        }
    }
	function Success()
{
		var name =  document.getElementById('textname').value
		var p1 =  document.getElementById('pass').value
		var p2 =  document.getElementById('pword').value
		var cou =  document.getElementById('course').value
		var opt =  document.getElementById('qualification').value
		var db =  document.getElementById('txtDate').value

		//console.log(name + p1 + p2 + cou + opt + db)

		if(name === undefined || name == null || name.length <= 0 ||
			p1 === undefined || p1 == null || p1.length <= 0 ||
			p2 === undefined || p2 == null || p2.length <= 0 ||
			cou === undefined || cou == null || cou.length <= 0 ||
			opt === undefined || opt == null || opt.length <= 0){
			alert('All Fields Mandatory!')
			return false;
		}

	
		return true;
	}

 