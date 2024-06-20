/**
 * Validar campos obrigatorios do formulario
 * @author Maria Fernanda
 */

function validar() {
	let nome = frmContato.nome.value
	let cidade = frmContato.cidade.value
	let email = frmContato.email.value
	let profissao = frmContato.profissao.value
	let telefone = frmContato.telefone.value
	if (nome === "") {
		alert('Preencha o campo Nome')
		frmContato.nome.focus()
		return false
	} else if (cidade === ""){
		alert('Preencha o campo Cidade')
		frmContato.cidade.focus()
		return false
	} else if (email ===""){
		alert('Preencha o campo email')
		frmContato.email.focus()
		return false
	} else if (profissao === ""){
	  alert('Preencha o campo Profissão')
	  frmContato.profissao.focus()
	  return false
	} else if (telefone === "") {
		alert('Preencha o campo Telefone')
		frmContato.telefone.focus()
		return false
	} else {
		document.forms["frmContato"].submit()
	}
}