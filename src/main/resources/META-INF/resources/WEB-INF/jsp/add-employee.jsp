
<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>

<div class="container mt-5">
    <h1 class="mb-4">Add your Details Here</h1>
    
    <form method="post" >
        <div class="row mb-3">
            <label class="col-sm-2 col-form-label">Name:</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" name="name" required="true">
            </div>
        </div>

        <div class="row mb-3">
            <label class="col-sm-2 col-form-label">Technology:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="technology">
            </div>
        </div>

        <div class="row mb-3">
            <label class="col-sm-2 col-form-label">Experience (years):</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="experiaence">
            </div>
        </div>

      
        <div class="text-end">
            
		<button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>
<%@ include file="common/footer.jspf" %>
