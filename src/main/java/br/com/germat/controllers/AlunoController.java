package br.com.germat.controllers;

import br.com.germat.dao.AlunoDao;
import br.com.germat.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {
    @Autowired
    private AlunoDao alunorepositorio;

    @GetMapping("/inserirAlunos")
    public ModelAndView InsertAlunos(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Aluno/formAluno");
        mv.addObject("aluno", new Aluno());
        return mv;
    }

    @PostMapping("InsertAlunos")
    public ModelAndView inserirAluno(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/alunos-adicionados");
        alunorepositorio.save(aluno);
        return mv;
    }

    @GetMapping("alunos-adicionados")
    public ModelAndView listagemAlunos() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Aluno/listAlunos");
        mv.addObject("alunosList", alunorepositorio.findAll());
        return mv;
    }
}
