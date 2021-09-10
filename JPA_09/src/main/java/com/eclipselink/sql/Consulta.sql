Select 
 *
FROM 
 Professor_Disciplina pd
Inner Join PROFESSOR p ON (p.IDPROFESSOR = pd.Professor_IDPROFESSOR)
Inner Join DISCIPLINA d ON (d.IDDISCIPLINA = pd.disciplinaSet_IDDISCIPLINA)
ORDER BY p.IDPROFESSOR, d.IDDISCIPLINA;