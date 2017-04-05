function validate()
{
	if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(document.getElementById("user").value))
	{
    window.location.href="show";
	}	
	else
	{
		//alert("wrong pattern");
		window.location.reload(true);
	}
}