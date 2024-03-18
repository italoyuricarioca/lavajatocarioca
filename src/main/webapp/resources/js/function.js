/* M�scaras */
function muda(el) {
    $("#telefone").val('');
    if(el=="celular"){
        $("#telefone").mask("(99)99999-9999");
    }else{
        $("#telefone").mask("(99)9999-9999");
    }
}
jQuery(function($){
    $("#placa").mask("aaa-9999");
    $("#telefone").mask("(99)99999-9999"); //Pr�-definido ao carregar p�gina
    $("#campoSenha").mask("***-****");
    $("#cor").attr('readonly', false);
});
