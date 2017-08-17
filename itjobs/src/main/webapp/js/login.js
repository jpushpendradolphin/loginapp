/**
 * js file here
 */

	function validateForm() {
	    var uname = document.forms["loginForm"]["uname"].value;
	    var pass = document.forms["loginForm"]["pass"].value;
	    if (uname == "" || uname == undefined) {
	        alert("User Name must be filled out");
	        return false;
	    }
	    
	    if (pass == "" || uname == pass) {
	        alert("Password must be filled out");
	        return false;
	    }
	}
