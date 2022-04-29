<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty mensagem}">

	<!-- Alert - From Boostrap -->
	<div class="alert alert-secondary alert-dismissible fade show"
		role="alert">
		<strong>${mensagem}</strong>
		<button type="button" class="btn-close" data-bs-dismiss="alert"
			aria-label="Close"></button>
	</div>


</c:if>




