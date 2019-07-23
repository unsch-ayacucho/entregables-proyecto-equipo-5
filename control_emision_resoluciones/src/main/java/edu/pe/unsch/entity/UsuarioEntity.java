package edu.pe.unsch.entity;

import java.util.Date;

public interface UsuarioEntity {

	Integer getIdUsuario();

	void setIdUsuario(Integer idUsuario);

	Firma getFirma();

	void setFirma(Firma firma);

	String getEmail();

	void setEmail(String email);

	String getPassword();

	void setPassword(String password);

	String getCargo();

	void setCargo(String cargo);

	String getRol();

	void setRol(String rol);

	Date getUltimoLogin();

	void setUltimoLogin(Date ultimoLogin);

	byte[] getFoto();

	void setFoto(byte[] foto);

}