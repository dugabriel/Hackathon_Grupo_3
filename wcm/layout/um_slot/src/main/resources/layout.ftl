<#import "/wcm.ftl" as wcm/>
<@wcm.header />

<!-- WCM Wrapper content -->
<div class="wcm-wrapper-content">

    <@wcm.menu />

    <!-- Wrapper -->
    <div class="wcm-all-content">
        <div id="wcm-content" class="clearfix wcm-background">

            <!-- Onde deverá estar a barra de formatação -->
            <#if pageRender.isEditMode()=true>
                <div name="formatBar" id="formatBar"></div>
                <!-- Div geral -->
                <!-- Há CSS distinto para Edição/Visualização -->
            <div id="edicaoPagina" class="clearfix">
            <#else>
            <div id="visualizacaoPagina" class="clearfix">
            </#if>


                <!-- Slot 1 -->
                <div class="editable-slot slotfull layout-1-1" id="slotFull1">
                    <@wcm.renderSlot id="SlotA" editableSlot="true"/>
                </div>


            </div>
            <@wcm.footer layoutuserlabel="wcm.layoutsimples.user" />

        </div>
	</div>
</div>
