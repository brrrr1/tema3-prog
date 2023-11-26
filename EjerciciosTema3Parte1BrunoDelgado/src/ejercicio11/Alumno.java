package ejercicio11;

import java.util.Arrays;

public class Alumno {

	private String curso;
	private int [] notas;
	private int suspensos;
	private double media;
	
	public Alumno(String curso, int[] notas, int suspensos, double media) {
		this.curso = curso;
		this.notas = notas;
		this.suspensos = suspensos;
		this.media = media;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public int getSuspensos() {
		return suspensos;
	}

	public void setSuspensos(int suspensos) {
		this.suspensos = suspensos;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", notas=" + Arrays.toString(notas) + ", suspensos=" + suspensos + ", media="
				+ media + "]";
	}
	
	
	
	}


	
	
	
	
	

