/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.org.stela.intelectus.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-9")
public class StagingRecord
		implements org.apache.thrift.TBase<StagingRecord, StagingRecord._Fields>, java.io.Serializable, Cloneable, Comparable<StagingRecord> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StagingRecord");

	private static final org.apache.thrift.protocol.TField ID_FIELD_DESC =
			new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField LAST_UPDATE_FIELD_DESC =
			new org.apache.thrift.protocol.TField("lastUpdate", org.apache.thrift.protocol.TType.I64, (short) 2);
	private static final org.apache.thrift.protocol.TField PROCESS_ID_FIELD_DESC =
			new org.apache.thrift.protocol.TField("processId", org.apache.thrift.protocol.TType.STRING, (short) 3);
	private static final org.apache.thrift.protocol.TField OPERATION_TYPE_FIELD_DESC =
			new org.apache.thrift.protocol.TField("operationType", org.apache.thrift.protocol.TType.I32, (short) 4);
	private static final org.apache.thrift.protocol.TField PESSOA_FIELD_DESC =
			new org.apache.thrift.protocol.TField("pessoa", org.apache.thrift.protocol.TType.STRUCT, (short) 5);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

	static {
		schemes.put(StandardScheme.class, new StagingRecordStandardSchemeFactory());
		schemes.put(TupleScheme.class, new StagingRecordTupleSchemeFactory());
	}

	private String id; // required
	private long lastUpdate; // required
	private String processId; // required
	private OperationType operationType; // required
	private br.org.stela.intelectus.lattes.thrift.Pessoa pessoa; // required

	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		ID((short) 1, "id"),
		LAST_UPDATE((short) 2, "lastUpdate"),
		PROCESS_ID((short) 3, "processId"),
		/**
		 * 
		 * @see OperationType
		 */
		OPERATION_TYPE((short) 4, "operationType"),
		PESSOA((short) 5, "pessoa");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // ID
				return ID;
			case 2: // LAST_UPDATE
				return LAST_UPDATE;
			case 3: // PROCESS_ID
				return PROCESS_ID;
			case 4: // OPERATION_TYPE
				return OPERATION_TYPE;
			case 5: // PESSOA
				return PESSOA;
			default:
				return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	// isset id assignments
	private static final int __LASTUPDATE_ISSET_ID = 0;
	private byte __isset_bitfield = 0;
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
		tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.LAST_UPDATE, new org.apache.thrift.meta_data.FieldMetaData("lastUpdate", org.apache.thrift.TFieldRequirementType.REQUIRED,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64, "timestamp")));
		tmpMap.put(_Fields.PROCESS_ID, new org.apache.thrift.meta_data.FieldMetaData("processId", org.apache.thrift.TFieldRequirementType.REQUIRED,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.OPERATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("operationType", org.apache.thrift.TFieldRequirementType.REQUIRED,
				new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OperationType.class)));
		tmpMap.put(_Fields.PESSOA, new org.apache.thrift.meta_data.FieldMetaData("pessoa", org.apache.thrift.TFieldRequirementType.REQUIRED,
				new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.org.stela.intelectus.lattes.thrift.Pessoa.class)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StagingRecord.class, metaDataMap);
	}

	public StagingRecord() {
	}

	public StagingRecord(String id, long lastUpdate, String processId, OperationType operationType, br.org.stela.intelectus.lattes.thrift.Pessoa pessoa) {
		this();
		this.id = id;
		this.lastUpdate = lastUpdate;
		setLastUpdateIsSet(true);
		this.processId = processId;
		this.operationType = operationType;
		this.pessoa = pessoa;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public StagingRecord(StagingRecord other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetId()) {
			this.id = other.id;
		}
		this.lastUpdate = other.lastUpdate;
		if (other.isSetProcessId()) {
			this.processId = other.processId;
		}
		if (other.isSetOperationType()) {
			this.operationType = other.operationType;
		}
		if (other.isSetPessoa()) {
			this.pessoa = new br.org.stela.intelectus.lattes.thrift.Pessoa(other.pessoa);
		}
	}

	public StagingRecord deepCopy() {
		return new StagingRecord(this);
	}

	@Override
	public void clear() {
		this.id = null;
		setLastUpdateIsSet(false);
		this.lastUpdate = 0;
		this.processId = null;
		this.operationType = null;
		this.pessoa = null;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void unsetId() {
		this.id = null;
	}

	/** Returns true if field id is set (has been assigned a value) and false otherwise */
	public boolean isSetId() {
		return this.id != null;
	}

	public void setIdIsSet(boolean value) {
		if (!value) {
			this.id = null;
		}
	}

	public long getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
		setLastUpdateIsSet(true);
	}

	public void unsetLastUpdate() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTUPDATE_ISSET_ID);
	}

	/** Returns true if field lastUpdate is set (has been assigned a value) and false otherwise */
	public boolean isSetLastUpdate() {
		return EncodingUtils.testBit(__isset_bitfield, __LASTUPDATE_ISSET_ID);
	}

	public void setLastUpdateIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTUPDATE_ISSET_ID, value);
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void unsetProcessId() {
		this.processId = null;
	}

	/** Returns true if field processId is set (has been assigned a value) and false otherwise */
	public boolean isSetProcessId() {
		return this.processId != null;
	}

	public void setProcessIdIsSet(boolean value) {
		if (!value) {
			this.processId = null;
		}
	}

	/**
	 * 
	 * @see OperationType
	 */
	public OperationType getOperationType() {
		return this.operationType;
	}

	/**
	 * 
	 * @see OperationType
	 */
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	public void unsetOperationType() {
		this.operationType = null;
	}

	/** Returns true if field operationType is set (has been assigned a value) and false otherwise */
	public boolean isSetOperationType() {
		return this.operationType != null;
	}

	public void setOperationTypeIsSet(boolean value) {
		if (!value) {
			this.operationType = null;
		}
	}

	public br.org.stela.intelectus.lattes.thrift.Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(br.org.stela.intelectus.lattes.thrift.Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void unsetPessoa() {
		this.pessoa = null;
	}

	/** Returns true if field pessoa is set (has been assigned a value) and false otherwise */
	public boolean isSetPessoa() {
		return this.pessoa != null;
	}

	public void setPessoaIsSet(boolean value) {
		if (!value) {
			this.pessoa = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case ID:
			if (value == null) {
				unsetId();
			} else {
				setId((String) value);
			}
			break;

		case LAST_UPDATE:
			if (value == null) {
				unsetLastUpdate();
			} else {
				setLastUpdate((Long) value);
			}
			break;

		case PROCESS_ID:
			if (value == null) {
				unsetProcessId();
			} else {
				setProcessId((String) value);
			}
			break;

		case OPERATION_TYPE:
			if (value == null) {
				unsetOperationType();
			} else {
				setOperationType((OperationType) value);
			}
			break;

		case PESSOA:
			if (value == null) {
				unsetPessoa();
			} else {
				setPessoa((br.org.stela.intelectus.lattes.thrift.Pessoa) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case ID:
			return getId();

		case LAST_UPDATE:
			return Long.valueOf(getLastUpdate());

		case PROCESS_ID:
			return getProcessId();

		case OPERATION_TYPE:
			return getOperationType();

		case PESSOA:
			return getPessoa();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case ID:
			return isSetId();
		case LAST_UPDATE:
			return isSetLastUpdate();
		case PROCESS_ID:
			return isSetProcessId();
		case OPERATION_TYPE:
			return isSetOperationType();
		case PESSOA:
			return isSetPessoa();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof StagingRecord)
			return this.equals((StagingRecord) that);
		return false;
	}

	public boolean equals(StagingRecord that) {
		if (that == null)
			return false;

		boolean this_present_id = true && this.isSetId();
		boolean that_present_id = true && that.isSetId();
		if (this_present_id || that_present_id) {
			if (!(this_present_id && that_present_id))
				return false;
			if (!this.id.equals(that.id))
				return false;
		}

		boolean this_present_lastUpdate = true;
		boolean that_present_lastUpdate = true;
		if (this_present_lastUpdate || that_present_lastUpdate) {
			if (!(this_present_lastUpdate && that_present_lastUpdate))
				return false;
			if (this.lastUpdate != that.lastUpdate)
				return false;
		}

		boolean this_present_processId = true && this.isSetProcessId();
		boolean that_present_processId = true && that.isSetProcessId();
		if (this_present_processId || that_present_processId) {
			if (!(this_present_processId && that_present_processId))
				return false;
			if (!this.processId.equals(that.processId))
				return false;
		}

		boolean this_present_operationType = true && this.isSetOperationType();
		boolean that_present_operationType = true && that.isSetOperationType();
		if (this_present_operationType || that_present_operationType) {
			if (!(this_present_operationType && that_present_operationType))
				return false;
			if (!this.operationType.equals(that.operationType))
				return false;
		}

		boolean this_present_pessoa = true && this.isSetPessoa();
		boolean that_present_pessoa = true && that.isSetPessoa();
		if (this_present_pessoa || that_present_pessoa) {
			if (!(this_present_pessoa && that_present_pessoa))
				return false;
			if (!this.pessoa.equals(that.pessoa))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_id = true && (isSetId());
		list.add(present_id);
		if (present_id)
			list.add(id);

		boolean present_lastUpdate = true;
		list.add(present_lastUpdate);
		if (present_lastUpdate)
			list.add(lastUpdate);

		boolean present_processId = true && (isSetProcessId());
		list.add(present_processId);
		if (present_processId)
			list.add(processId);

		boolean present_operationType = true && (isSetOperationType());
		list.add(present_operationType);
		if (present_operationType)
			list.add(operationType.getValue());

		boolean present_pessoa = true && (isSetPessoa());
		list.add(present_pessoa);
		if (present_pessoa)
			list.add(pessoa);

		return list.hashCode();
	}

	@Override
	public int compareTo(StagingRecord other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetLastUpdate()).compareTo(other.isSetLastUpdate());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetLastUpdate()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastUpdate, other.lastUpdate);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetProcessId()).compareTo(other.isSetProcessId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetProcessId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processId, other.processId);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetOperationType()).compareTo(other.isSetOperationType());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetOperationType()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationType, other.operationType);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetPessoa()).compareTo(other.isSetPessoa());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPessoa()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pessoa, other.pessoa);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
		schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("StagingRecord(");
		boolean first = true;

		sb.append("id:");
		if (this.id == null) {
			sb.append("null");
		} else {
			sb.append(this.id);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("lastUpdate:");
		sb.append(this.lastUpdate);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("processId:");
		if (this.processId == null) {
			sb.append("null");
		} else {
			sb.append(this.processId);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("operationType:");
		if (this.operationType == null) {
			sb.append("null");
		} else {
			sb.append(this.operationType);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("pessoa:");
		if (this.pessoa == null) {
			sb.append("null");
		} else {
			sb.append(this.pessoa);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		if (!isSetId()) {
			throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' is unset! Struct:" + toString());
		}

		if (!isSetLastUpdate()) {
			throw new org.apache.thrift.protocol.TProtocolException("Required field 'lastUpdate' is unset! Struct:" + toString());
		}

		if (!isSetProcessId()) {
			throw new org.apache.thrift.protocol.TProtocolException("Required field 'processId' is unset! Struct:" + toString());
		}

		if (!isSetOperationType()) {
			throw new org.apache.thrift.protocol.TProtocolException("Required field 'operationType' is unset! Struct:" + toString());
		}

		if (!isSetPessoa()) {
			throw new org.apache.thrift.protocol.TProtocolException("Required field 'pessoa' is unset! Struct:" + toString());
		}

		// check for sub-struct validity
		if (pessoa != null) {
			pessoa.validate();
		}
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
			__isset_bitfield = 0;
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class StagingRecordStandardSchemeFactory implements SchemeFactory {
		public StagingRecordStandardScheme getScheme() {
			return new StagingRecordStandardScheme();
		}
	}

	private static class StagingRecordStandardScheme extends StandardScheme<StagingRecord> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, StagingRecord struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.id = iprot.readString();
						struct.setIdIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // LAST_UPDATE
					if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
						struct.lastUpdate = iprot.readI64();
						struct.setLastUpdateIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // PROCESS_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.processId = iprot.readString();
						struct.setProcessIdIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // OPERATION_TYPE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.operationType = br.org.stela.intelectus.service.thrift.OperationType.findByValue(iprot.readI32());
						struct.setOperationTypeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // PESSOA
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.pessoa = new br.org.stela.intelectus.lattes.thrift.Pessoa();
						struct.pessoa.read(iprot);
						struct.setPessoaIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				default:
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
				}
				iprot.readFieldEnd();
			}
			iprot.readStructEnd();
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, StagingRecord struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.id != null) {
				oprot.writeFieldBegin(ID_FIELD_DESC);
				oprot.writeString(struct.id);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(LAST_UPDATE_FIELD_DESC);
			oprot.writeI64(struct.lastUpdate);
			oprot.writeFieldEnd();
			if (struct.processId != null) {
				oprot.writeFieldBegin(PROCESS_ID_FIELD_DESC);
				oprot.writeString(struct.processId);
				oprot.writeFieldEnd();
			}
			if (struct.operationType != null) {
				oprot.writeFieldBegin(OPERATION_TYPE_FIELD_DESC);
				oprot.writeI32(struct.operationType.getValue());
				oprot.writeFieldEnd();
			}
			if (struct.pessoa != null) {
				oprot.writeFieldBegin(PESSOA_FIELD_DESC);
				struct.pessoa.write(oprot);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class StagingRecordTupleSchemeFactory implements SchemeFactory {
		public StagingRecordTupleScheme getScheme() {
			return new StagingRecordTupleScheme();
		}
	}

	private static class StagingRecordTupleScheme extends TupleScheme<StagingRecord> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, StagingRecord struct) throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			oprot.writeString(struct.id);
			oprot.writeI64(struct.lastUpdate);
			oprot.writeString(struct.processId);
			oprot.writeI32(struct.operationType.getValue());
			struct.pessoa.write(oprot);
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, StagingRecord struct) throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			struct.id = iprot.readString();
			struct.setIdIsSet(true);
			struct.lastUpdate = iprot.readI64();
			struct.setLastUpdateIsSet(true);
			struct.processId = iprot.readString();
			struct.setProcessIdIsSet(true);
			struct.operationType = br.org.stela.intelectus.service.thrift.OperationType.findByValue(iprot.readI32());
			struct.setOperationTypeIsSet(true);
			struct.pessoa = new br.org.stela.intelectus.lattes.thrift.Pessoa();
			struct.pessoa.read(iprot);
			struct.setPessoaIsSet(true);
		}
	}

}
