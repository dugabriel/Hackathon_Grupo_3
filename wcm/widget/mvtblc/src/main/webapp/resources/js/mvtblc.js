var HelloWorld = SuperWidget.extend({
    message: null,
    baixoRisco: null,
    altoRisco: null,

    init: function () {
    	var self = this;
    	
    	//self.chartLine();
    	//self.chartDoughnut();
    	var x = 60;
    	var y = 40;
    	
    	setTimeout(function(){
    		aprovado.innerHTML = x;
    		reprovado.innerHTML = y;
    	}, 200);
    	
    },

    bindings: {
        local: {
            'show-message': ['click_showMessage']
    		
        }
    },

    showMessage: function () {
    	var self = this;
    	
    	var selectedState = '';
    	var selectedColleagues = new Array("bob");
    	var password = null;
    	var observation = '';
    	var managerMode = false;
    	var instances = new Array();
    	
     	var approved = 'N';
    	var instancesReceive = new Array("1361", "1362");
  
    	
    	for (var i = 0; i < instancesReceive.length; i++) {
    		if (approved == 'S') {
    			selectedState = "9";
    			instances.push(self.getInstances(instancesReceive[i], '2'));
    			observation = 'Movimento Automátivo APROVADO';
    		} else {
    			selectedState = "11";
    			instances.push(self.getInstances(instancesReceive[i], '2'));
    			observation = 'Movimento Automátivo REPROVADO';
    		}
    		
    	}
    	
    	self.ajaxAPI(selectedState, selectedColleagues, password, observation, instances, managerMode);
    	
    },
    
    getInstances: function(intances, movementSequence) {
    	return { 
    		"instanceId": intances,
    		"movementSequence":movementSequence
    	}
    }, 
    
    ajaxAPI: function(selectedState, selectedColleagues, password, observation, instances, managerMode) {
    	
        var url = WCMAPI.getServerURL();
        var d = $.Deferred();
        var request_data = {
            url: url+'/ecm/api/rest/ecm/centralTasks/batchSend',
            method: 'POST',
            ajaxData: JSON.stringify({
            	"selectedState": selectedState,
        		 "selectedColleagues":selectedColleagues,
        		 "password":password,
        		 "observation":observation,
        		 "instances":instances || [],
        		 "managerMode":managerMode
            }),
            data: {}
        };
        
        
        $.ajax({
            url: request_data.url,
            async: true,
            type: request_data.method,
            data: request_data.ajaxData,
            contentType: "application/json"
        })
        .done(function(result){
        	console.log(result);
            d.resolve(result);
            FLUIGC.message.alert({
            	message: "Solicitações movimentadas com sucesso!",
        		title: 'Message',
        	    label: 'OK'
            });          
        })
        .fail(function(data){
            d.reject
            console.log(data);
            FLUIGC.message.alert({
            	message: "Erro ao movimentar as solicitações em bloco!",
        		title: 'Message',
        	    label: 'OK'
            });
        });
        //return d;
    },
    
    chartLine: function () {
    	var chartLine = FLUIGC.chart('#line', {
    	    id: 'set_an_id_for_my_chart',
    	    width: '700',
    	    height: '200',
    	});
    	
    	var dataLine = {
    		    labels: ["January", "February", "March", "April", "May", "June", "July"],
    		    datasets: [
    		        {
    		            label: "My First dataset",
    		            fillColor: "rgba(220,220,220,0.2)",
    		            strokeColor: "rgba(220,220,220,1)",
    		            pointColor: "rgba(220,220,220,1)",
    		            pointStrokeColor: "#fff",
    		            pointHighlightFill: "#fff",
    		            pointHighlightStroke: "rgba(220,220,220,1)",
    		            data: [65, 59, 80, 81, 56, 55, 40]
    		        },
    		        {
    		            label: "My Second dataset",
    		            fillColor: "rgba(151,187,205,0.2)",
    		            strokeColor: "rgba(151,187,205,1)",
    		            pointColor: "rgba(151,187,205,1)",
    		            pointStrokeColor: "#fff",
    		            pointHighlightFill: "#fff",
    		            pointHighlightStroke: "rgba(151,187,205,1)",
    		            data: [28, 48, 40, 19, 86, 27, 90]
    		        }
    		    ]
    		};
    	var options = null;
    	var lineChart = chartLine.line(dataLine, options);
    },
    
    chartDoughnut: function() {
    	var chartDoughnut = FLUIGC.chart('#doughnut', {
			id: 'set_an_id_for_my_chart',
        	width: '700',
        	height: '200',
		});
	
		var dataDoughnut = [
	            {
	                value: 300,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "Red"
	            },
	            {
	                value: 50,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "Green"
	            },
	            {
	                value: 100,
	                color: "#FDB45C",
	                highlight: "#FFC870",
	                label: "Yellow"
	            }
	        ]
		var options = [{
			percentageInnerCutout: 100
		}];
		var doughnutChart = chartDoughnut.doughnut(dataDoughnut, options);
		
		$('#doughnut').on('fluig.chart.doughnut.click', function(data) {
		    alert("opa");
		    console.log(data);
		});
    }
});