Select 
 * 
From 
 DEPARTAMENTO_FUNCIONARIO 
Left Join DEPARTAMENTO 
 ON (DEPARTAMENTO.idDepto = DEPARTAMENTO_FUNCIONARIO.DEPARTAMENTO_IdDepto) 
Left Join FUNCIONARIO
 ON (FUNCIONARIO.IdFuncionario = DEPARTAMENTO_FUNCIONARIO.FUNCIONARIO_IdFuncionario);