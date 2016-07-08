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
public class SliceAnnotations
		implements org.apache.thrift.TBase<SliceAnnotations, SliceAnnotations._Fields>, java.io.Serializable, Cloneable, Comparable<SliceAnnotations> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SliceAnnotations");

	private static final org.apache.thrift.protocol.TField VALUES_MAP_FIELD_DESC =
			new org.apache.thrift.protocol.TField("valuesMap", org.apache.thrift.protocol.TType.MAP, (short) 1);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

	static {
		schemes.put(StandardScheme.class, new SliceAnnotationsStandardSchemeFactory());
		schemes.put(TupleScheme.class, new SliceAnnotationsTupleSchemeFactory());
	}

	private Map<String, Map<AnnotationType, List<AnnotationValue>>> valuesMap; // required

	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		VALUES_MAP((short) 1, "valuesMap");

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
			case 1: // VALUES_MAP
				return VALUES_MAP;
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
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
		tmpMap.put(_Fields.VALUES_MAP,
				new org.apache.thrift.meta_data.FieldMetaData("valuesMap", org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
								new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING),
								new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, new org.apache.thrift.meta_data.EnumMetaData(
										org.apache.thrift.protocol.TType.ENUM, AnnotationType.class),
								new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
										new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AnnotationValue.class))))));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SliceAnnotations.class, metaDataMap);
	}

	public SliceAnnotations() {
	}

	public SliceAnnotations(Map<String, Map<AnnotationType, List<AnnotationValue>>> valuesMap) {
		this();
		this.valuesMap = valuesMap;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public SliceAnnotations(SliceAnnotations other) {
		if (other.isSetValuesMap()) {
			Map<String, Map<AnnotationType, List<AnnotationValue>>> __this__valuesMap =
					new HashMap<String, Map<AnnotationType, List<AnnotationValue>>>(other.valuesMap.size());
			for (Map.Entry<String, Map<AnnotationType, List<AnnotationValue>>> other_element : other.valuesMap.entrySet()) {

				String other_element_key = other_element.getKey();
				Map<AnnotationType, List<AnnotationValue>> other_element_value = other_element.getValue();

				String __this__valuesMap_copy_key = other_element_key;

				Map<AnnotationType, List<AnnotationValue>> __this__valuesMap_copy_value =
						new HashMap<AnnotationType, List<AnnotationValue>>(other_element_value.size());
				for (Map.Entry<AnnotationType, List<AnnotationValue>> other_element_value_element : other_element_value.entrySet()) {

					AnnotationType other_element_value_element_key = other_element_value_element.getKey();
					List<AnnotationValue> other_element_value_element_value = other_element_value_element.getValue();

					AnnotationType __this__valuesMap_copy_value_copy_key = other_element_value_element_key;

					List<AnnotationValue> __this__valuesMap_copy_value_copy_value = new ArrayList<AnnotationValue>(other_element_value_element_value.size());
					for (AnnotationValue other_element_value_element_value_element : other_element_value_element_value) {
						__this__valuesMap_copy_value_copy_value.add(new AnnotationValue(other_element_value_element_value_element));
					}

					__this__valuesMap_copy_value.put(__this__valuesMap_copy_value_copy_key, __this__valuesMap_copy_value_copy_value);
				}

				__this__valuesMap.put(__this__valuesMap_copy_key, __this__valuesMap_copy_value);
			}
			this.valuesMap = __this__valuesMap;
		}
	}

	public SliceAnnotations deepCopy() {
		return new SliceAnnotations(this);
	}

	@Override
	public void clear() {
		this.valuesMap = null;
	}

	public int getValuesMapSize() {
		return (this.valuesMap == null) ? 0 : this.valuesMap.size();
	}

	public void putToValuesMap(String key, Map<AnnotationType, List<AnnotationValue>> val) {
		if (this.valuesMap == null) {
			this.valuesMap = new HashMap<String, Map<AnnotationType, List<AnnotationValue>>>();
		}
		this.valuesMap.put(key, val);
	}

	public Map<String, Map<AnnotationType, List<AnnotationValue>>> getValuesMap() {
		return this.valuesMap;
	}

	public void setValuesMap(Map<String, Map<AnnotationType, List<AnnotationValue>>> valuesMap) {
		this.valuesMap = valuesMap;
	}

	public void unsetValuesMap() {
		this.valuesMap = null;
	}

	/** Returns true if field valuesMap is set (has been assigned a value) and false otherwise */
	public boolean isSetValuesMap() {
		return this.valuesMap != null;
	}

	public void setValuesMapIsSet(boolean value) {
		if (!value) {
			this.valuesMap = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case VALUES_MAP:
			if (value == null) {
				unsetValuesMap();
			} else {
				setValuesMap((Map<String, Map<AnnotationType, List<AnnotationValue>>>) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case VALUES_MAP:
			return getValuesMap();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case VALUES_MAP:
			return isSetValuesMap();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof SliceAnnotations)
			return this.equals((SliceAnnotations) that);
		return false;
	}

	public boolean equals(SliceAnnotations that) {
		if (that == null)
			return false;

		boolean this_present_valuesMap = true && this.isSetValuesMap();
		boolean that_present_valuesMap = true && that.isSetValuesMap();
		if (this_present_valuesMap || that_present_valuesMap) {
			if (!(this_present_valuesMap && that_present_valuesMap))
				return false;
			if (!this.valuesMap.equals(that.valuesMap))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_valuesMap = true && (isSetValuesMap());
		list.add(present_valuesMap);
		if (present_valuesMap)
			list.add(valuesMap);

		return list.hashCode();
	}

	@Override
	public int compareTo(SliceAnnotations other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetValuesMap()).compareTo(other.isSetValuesMap());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetValuesMap()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valuesMap, other.valuesMap);
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
		StringBuilder sb = new StringBuilder("SliceAnnotations(");
		boolean first = true;

		sb.append("valuesMap:");
		if (this.valuesMap == null) {
			sb.append("null");
		} else {
			sb.append(this.valuesMap);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		if (!isSetValuesMap()) {
			throw new org.apache.thrift.protocol.TProtocolException("Required field 'valuesMap' is unset! Struct:" + toString());
		}

		// check for sub-struct validity
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
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class SliceAnnotationsStandardSchemeFactory implements SchemeFactory {
		public SliceAnnotationsStandardScheme getScheme() {
			return new SliceAnnotationsStandardScheme();
		}
	}

	private static class SliceAnnotationsStandardScheme extends StandardScheme<SliceAnnotations> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, SliceAnnotations struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // VALUES_MAP
					if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
						{
							org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
							struct.valuesMap = new HashMap<String, Map<AnnotationType, List<AnnotationValue>>>(2 * _map8.size);
							String _key9;
							Map<AnnotationType, List<AnnotationValue>> _val10;
							for (int _i11 = 0; _i11 < _map8.size; ++_i11) {
								_key9 = iprot.readString();
								{
									org.apache.thrift.protocol.TMap _map12 = iprot.readMapBegin();
									_val10 = new HashMap<AnnotationType, List<AnnotationValue>>(2 * _map12.size);
									AnnotationType _key13;
									List<AnnotationValue> _val14;
									for (int _i15 = 0; _i15 < _map12.size; ++_i15) {
										_key13 = br.org.stela.intelectus.service.thrift.AnnotationType.findByValue(iprot.readI32());
										{
											org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
											_val14 = new ArrayList<AnnotationValue>(_list16.size);
											AnnotationValue _elem17;
											for (int _i18 = 0; _i18 < _list16.size; ++_i18) {
												_elem17 = new AnnotationValue();
												_elem17.read(iprot);
												_val14.add(_elem17);
											}
											iprot.readListEnd();
										}
										_val10.put(_key13, _val14);
									}
									iprot.readMapEnd();
								}
								struct.valuesMap.put(_key9, _val10);
							}
							iprot.readMapEnd();
						}
						struct.setValuesMapIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, SliceAnnotations struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.valuesMap != null) {
				oprot.writeFieldBegin(VALUES_MAP_FIELD_DESC);
				{
					oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP,
							struct.valuesMap.size()));
					for (Map.Entry<String, Map<AnnotationType, List<AnnotationValue>>> _iter19 : struct.valuesMap.entrySet()) {
						oprot.writeString(_iter19.getKey());
						{
							oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.LIST,
									_iter19.getValue().size()));
							for (Map.Entry<AnnotationType, List<AnnotationValue>> _iter20 : _iter19.getValue().entrySet()) {
								oprot.writeI32(_iter20.getKey().getValue());
								{
									oprot.writeListBegin(
											new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter20.getValue().size()));
									for (AnnotationValue _iter21 : _iter20.getValue()) {
										_iter21.write(oprot);
									}
									oprot.writeListEnd();
								}
							}
							oprot.writeMapEnd();
						}
					}
					oprot.writeMapEnd();
				}
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class SliceAnnotationsTupleSchemeFactory implements SchemeFactory {
		public SliceAnnotationsTupleScheme getScheme() {
			return new SliceAnnotationsTupleScheme();
		}
	}

	private static class SliceAnnotationsTupleScheme extends TupleScheme<SliceAnnotations> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, SliceAnnotations struct) throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			{
				oprot.writeI32(struct.valuesMap.size());
				for (Map.Entry<String, Map<AnnotationType, List<AnnotationValue>>> _iter22 : struct.valuesMap.entrySet()) {
					oprot.writeString(_iter22.getKey());
					{
						oprot.writeI32(_iter22.getValue().size());
						for (Map.Entry<AnnotationType, List<AnnotationValue>> _iter23 : _iter22.getValue().entrySet()) {
							oprot.writeI32(_iter23.getKey().getValue());
							{
								oprot.writeI32(_iter23.getValue().size());
								for (AnnotationValue _iter24 : _iter23.getValue()) {
									_iter24.write(oprot);
								}
							}
						}
					}
				}
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, SliceAnnotations struct) throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			{
				org.apache.thrift.protocol.TMap _map25 =
						new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
				struct.valuesMap = new HashMap<String, Map<AnnotationType, List<AnnotationValue>>>(2 * _map25.size);
				String _key26;
				Map<AnnotationType, List<AnnotationValue>> _val27;
				for (int _i28 = 0; _i28 < _map25.size; ++_i28) {
					_key26 = iprot.readString();
					{
						org.apache.thrift.protocol.TMap _map29 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32,
								org.apache.thrift.protocol.TType.LIST, iprot.readI32());
						_val27 = new HashMap<AnnotationType, List<AnnotationValue>>(2 * _map29.size);
						AnnotationType _key30;
						List<AnnotationValue> _val31;
						for (int _i32 = 0; _i32 < _map29.size; ++_i32) {
							_key30 = br.org.stela.intelectus.service.thrift.AnnotationType.findByValue(iprot.readI32());
							{
								org.apache.thrift.protocol.TList _list33 =
										new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
								_val31 = new ArrayList<AnnotationValue>(_list33.size);
								AnnotationValue _elem34;
								for (int _i35 = 0; _i35 < _list33.size; ++_i35) {
									_elem34 = new AnnotationValue();
									_elem34.read(iprot);
									_val31.add(_elem34);
								}
							}
							_val27.put(_key30, _val31);
						}
					}
					struct.valuesMap.put(_key26, _val27);
				}
			}
			struct.setValuesMapIsSet(true);
		}
	}

}
