/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.org.stela.intelectus.service.thrift;

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

@SuppressWarnings({"unused"})
public enum AnnotationType implements org.apache.thrift.TEnum {
	CienciasAgrariasAreaDeProducao(0),
	CienciasAgrariasAreaDeFormacao(1),
	CienciasAgrariasAreaDeAtuacao(2),
	TaxonomiaThesagro(3);

	private final int value;

	private AnnotationType(int value) {
		this.value = value;
	}

	/**
	 * Get the integer value of this enum value, as defined in the Thrift IDL.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Find a the enum type by its integer value, as defined in the Thrift IDL.
	 * 
	 * @return null if the value is not found.
	 */
	public static AnnotationType findByValue(int value) {
		switch (value) {
		case 0:
			return CienciasAgrariasAreaDeProducao;
		case 1:
			return CienciasAgrariasAreaDeFormacao;
		case 2:
			return CienciasAgrariasAreaDeAtuacao;
		case 3:
			return TaxonomiaThesagro;
		default:
			return null;
		}
	}
}
