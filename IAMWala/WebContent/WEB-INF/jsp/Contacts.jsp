<!DOCTYPE html>
<html lang="en">
<head>
<title>Contacts</title>

<%@ include file="include/header.jsp" %>
		<nav>
			<ul id="menu">
				<li class="alpha"><a href="home.html"><span><span>Home</span></span></a></li>
				<li><a href="about.html"><span><span>About</span></span> </a></li>
				<li><a href="project.html"><span><span>Top Recommended</span></span></a></li>
				<li id="menu_active"><a href="contact.html"><span><span>Contacts</span></span></a></li>
				<li class="omega"><a href="sitemap.html"><span><span>Sitemap</span></span></a></li>
			</ul>
		</nav>
		<div class="wrapper">
			<div class="text">
				<span class="text1">Effective<span>business solutions</span></span>
				<a href="#" class="button">read more</a>
			</div>
		</div>
	</header><div class="ic">More Website Templates at TemplateMonster.com!</div>
<!-- / header -->
<!-- content -->
	<section id="content">
		<div class="wrapper">
			<div class="pad">
				<div class="wrapper">
					<article class="col1"><h2>Contact form</h2></article>
					<article class="col2 pad_left1"><h2>Contact us</h2></article>
				</div>
			</div>
			<div class="box pad_bot1">
				<div class="pad marg_top">
					<article class="col1">
						<form id="ContactForm" action="">
							<div>
								<div class="wrapper">
									<div class="bg"><input class="input" type="text"></div>Name:
								</div>
								<div class="wrapper">
									<div class="bg"><input class="input" type="text"></div>Email:
								</div>
								<div class="wrapper">
									<div class="bg2"><textarea cols="1" rows="1"></textarea></div>Message:
								</div>
								<a href="#" class="button" onclick="document.getElementById('ContactForm').submit()">send</a>
								<a href="#" class="button" onclick="document.getElementById('ContactForm').reset()">clear</a>
							</div>
						</form>
					</article>
					<article class="col2 pad_left1">
						<div class="wrapper">
							<p class="cols pad_bot3">
								<strong>
									Country:<br>
									City:<br>
									Telephone:<br>
									Email:
								</strong>
							</p>
							<p class="pad_bot3">
								India<br>
								GZB<br>
								+91 9718172270<br>
								<a href="mailto:">nishant.kandhway2001@gmail.com</a>
							</p>
						</div>
						<h2>Miscellaneous Info</h2>
						<p class="pad_bot3">Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusantaque earum rerum hic.</p>
					</article>
				</div>
			</div>
			<div class="wrapper pad_bot4">
				<%@ include file="include/banner.jsp" %>
			</div>
		</div>
	</section>
<!-- / content -->
<%@ include file="include/footer.jsp" %>
</div>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>