<div id="HelloWorld_${instanceId}" class="super-widget wcm-widget-class fluig-style-guide"
     data-params="HelloWorld.instance({message: 'Hello world'})">
	<div class="row">
	    <div class="col-md-offset-1 col-lg-5 col-md-6" data-reprovado>
	        <div class="panel panel-success">
	            <div class="panel-heading">
	                <div class="row">
	                    <div class="col-xs-3">
	                        <i class="fluigicon fluigicon-thumbs-up fluigicon-thumbnail-lg"></i>
	                    </div>
	                    <div class="col-xs-7 text-center">
	                        <h1 id="aprovado" class="odometer">0</h1>
	                        <div>Tarefas em Baixo Risco</div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>	
		<div class="col-lg-5 col-md-6" data-aprovado>
	        <div class="panel panel-danger">
	            <div class="panel-heading">
	                <div class="row">
	                    <div class="col-xs-3">
	                        <i class="fluigicon fluigicon-thumbs-down fluigicon-thumbnail-lg"></i>
	                    </div>
	                    <div class="col-xs-7 text-center">
	                        <h1 id="reprovado" class="odometer">0</h1>
	                        <div>Tarefas em Alto Risco</div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
    
	
    <div>
        <button type="button" class="btn btn-default" data-show-message>${i18n.getTranslation('hello.button.showMessage')}</button>
    </div>
</div>
