<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pesquisa Sarah</title>
</head>
<body bgcolor="DA 70 D6">

	<form action="pesquisar">
		
		<center>
		
		<img src="https://img3.gratispng.com/dy/c327eb5e4918d780bba64306ca5bd89c/L0KzQYm3U8A6N5ZqfZH0aYP2gLBuTf1ib59ufutybnewd73okCMudZJshttvaXX1PbfzjBF1cZ9sRdV7ZXH3ecfsk71qeqNqfAd1YYKwccP5jCcueJZze9t1LXT1ccjwjvcuPZJmS6ICYnG1QYLpVMYvPGc4SKYCM0C0RYO3VsM0P2k7SaUANj7zfri=/kisspng-magnifying-glass-magnifier-floating-creatives-irregular-arrow-pencil-drawing-5aa307ba211b46.4630473015206337861356.png" 
			width="150">
		<br>
		<br>
		<label> <b> <font color="purple" size="+16"> Sobre o que você quer pesquisar? </font> </b> </label>
		
		<br>
		<br>
		
		<input type="text" name="pesquisa" size="70" style="height: 30px">
		
		<br>
		<br>
	
		<input type="radio" name="botaoPesquisa" value="google" style="height: 30px">
		<label> <font color="#363636" size="6"> Google </font> </label>
		
		<input type="radio" name="botaoPesquisa" value="bing" style="height: 30px">
		<label> <font color="#363636" size="6">Bing</font> </label>
		
		<input type="radio" name="botaoPesquisa" value="duckduckgo" style="height: 30px">
		<label> <font color="#363636" size="6"> DuckDuckGo </font> </label>
		
		<input type="radio" name="botaoPesquisa" value="yahoo" style="height: 30px">
		<label> <font color="#363636" size="6"> Yahoo! </font> </label>	
	
		<br>
		<br>
	
		<input type="submit" name="pesquisar" value="Pesquisar" size="100" style="height: 30px">		
		</center>
	
	</form>

</body>
</html>