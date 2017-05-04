/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")
    , @NamedQuery(name = "Aluno.findByCodAluno", query = "SELECT a FROM Aluno a WHERE a.codAluno = :codAluno")
    , @NamedQuery(name = "Aluno.findByDesNome", query = "SELECT a FROM Aluno a WHERE a.desNome = :desNome")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_aluno")
    private Integer codAluno;
    @Size(max = 45)
    @Column(name = "des_nome")
    private String desNome;

    public Aluno() {
    }

    public Aluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    public String getDesNome() {
        return desNome;
    }

    public void setDesNome(String desNome) {
        this.desNome = desNome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAluno != null ? codAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.codAluno == null && other.codAluno != null) || (this.codAluno != null && !this.codAluno.equals(other.codAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tabelas.Aluno[ codAluno=" + codAluno + " ]";
    }
    
}
