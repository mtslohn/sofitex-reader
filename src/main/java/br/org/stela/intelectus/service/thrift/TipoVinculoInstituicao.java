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
public enum TipoVinculoInstituicao implements org.apache.thrift.TEnum {
	EnderecoProfissional(0),
	FormacaoAluno(1),
	FormacaoEgresso(2),
	AtuacaoProfissional(3);

	private final int value;

	private TipoVinculoInstituicao(int value) {
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
	public static TipoVinculoInstituicao findByValue(int value) {
		switch (value) {
		case 0:
			return EnderecoProfissional;
		case 1:
			return FormacaoAluno;
		case 2:
			return FormacaoEgresso;
		case 3:
			return AtuacaoProfissional;
		default:
			return null;
		}
	}
}
