/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

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

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Contains the information of a block in Tachyon. It maintains the worker nodes where the replicas
 * of the blocks are stored.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-13")
public class BlockInfo implements org.apache.thrift.TBase<BlockInfo, BlockInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BlockInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BlockInfo");

  private static final org.apache.thrift.protocol.TField BLOCK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("blockId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("locations", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BlockInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BlockInfoTupleSchemeFactory());
  }

  public long blockId; // required
  public long length; // required
  public List<BlockLocation> locations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLOCK_ID((short)1, "blockId"),
    LENGTH((short)2, "length"),
    LOCATIONS((short)3, "locations");

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
      switch(fieldId) {
        case 1: // BLOCK_ID
          return BLOCK_ID;
        case 2: // LENGTH
          return LENGTH;
        case 3: // LOCATIONS
          return LOCATIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
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
  private static final int __BLOCKID_ISSET_ID = 0;
  private static final int __LENGTH_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLOCK_ID, new org.apache.thrift.meta_data.FieldMetaData("blockId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("locations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "BlockLocation"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BlockInfo.class, metaDataMap);
  }

  public BlockInfo() {
  }

  public BlockInfo(
    long blockId,
    long length,
    List<BlockLocation> locations)
  {
    this();
    this.blockId = blockId;
    setBlockIdIsSet(true);
    this.length = length;
    setLengthIsSet(true);
    this.locations = locations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlockInfo(BlockInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.blockId = other.blockId;
    this.length = other.length;
    if (other.isSetLocations()) {
      List<BlockLocation> __this__locations = new ArrayList<BlockLocation>(other.locations.size());
      for (BlockLocation other_element : other.locations) {
        __this__locations.add(other_element);
      }
      this.locations = __this__locations;
    }
  }

  public BlockInfo deepCopy() {
    return new BlockInfo(this);
  }

  @Override
  public void clear() {
    setBlockIdIsSet(false);
    this.blockId = 0;
    setLengthIsSet(false);
    this.length = 0;
    this.locations = null;
  }

  public long getBlockId() {
    return this.blockId;
  }

  public BlockInfo setBlockId(long blockId) {
    this.blockId = blockId;
    setBlockIdIsSet(true);
    return this;
  }

  public void unsetBlockId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BLOCKID_ISSET_ID);
  }

  /** Returns true if field blockId is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockId() {
    return EncodingUtils.testBit(__isset_bitfield, __BLOCKID_ISSET_ID);
  }

  public void setBlockIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BLOCKID_ISSET_ID, value);
  }

  public long getLength() {
    return this.length;
  }

  public BlockInfo setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return EncodingUtils.testBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LENGTH_ISSET_ID, value);
  }

  public int getLocationsSize() {
    return (this.locations == null) ? 0 : this.locations.size();
  }

  public java.util.Iterator<BlockLocation> getLocationsIterator() {
    return (this.locations == null) ? null : this.locations.iterator();
  }

  public void addToLocations(BlockLocation elem) {
    if (this.locations == null) {
      this.locations = new ArrayList<BlockLocation>();
    }
    this.locations.add(elem);
  }

  public List<BlockLocation> getLocations() {
    return this.locations;
  }

  public BlockInfo setLocations(List<BlockLocation> locations) {
    this.locations = locations;
    return this;
  }

  public void unsetLocations() {
    this.locations = null;
  }

  /** Returns true if field locations is set (has been assigned a value) and false otherwise */
  public boolean isSetLocations() {
    return this.locations != null;
  }

  public void setLocationsIsSet(boolean value) {
    if (!value) {
      this.locations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLOCK_ID:
      if (value == null) {
        unsetBlockId();
      } else {
        setBlockId((Long)value);
      }
      break;

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Long)value);
      }
      break;

    case LOCATIONS:
      if (value == null) {
        unsetLocations();
      } else {
        setLocations((List<BlockLocation>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLOCK_ID:
      return Long.valueOf(getBlockId());

    case LENGTH:
      return Long.valueOf(getLength());

    case LOCATIONS:
      return getLocations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BLOCK_ID:
      return isSetBlockId();
    case LENGTH:
      return isSetLength();
    case LOCATIONS:
      return isSetLocations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BlockInfo)
      return this.equals((BlockInfo)that);
    return false;
  }

  public boolean equals(BlockInfo that) {
    if (that == null)
      return false;

    boolean this_present_blockId = true;
    boolean that_present_blockId = true;
    if (this_present_blockId || that_present_blockId) {
      if (!(this_present_blockId && that_present_blockId))
        return false;
      if (this.blockId != that.blockId)
        return false;
    }

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    boolean this_present_locations = true && this.isSetLocations();
    boolean that_present_locations = true && that.isSetLocations();
    if (this_present_locations || that_present_locations) {
      if (!(this_present_locations && that_present_locations))
        return false;
      if (!this.locations.equals(that.locations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_blockId = true;
    list.add(present_blockId);
    if (present_blockId)
      list.add(blockId);

    boolean present_length = true;
    list.add(present_length);
    if (present_length)
      list.add(length);

    boolean present_locations = true && (isSetLocations());
    list.add(present_locations);
    if (present_locations)
      list.add(locations);

    return list.hashCode();
  }

  @Override
  public int compareTo(BlockInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBlockId()).compareTo(other.isSetBlockId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockId, other.blockId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLength()).compareTo(other.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, other.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocations()).compareTo(other.isSetLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locations, other.locations);
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
    StringBuilder sb = new StringBuilder("BlockInfo(");
    boolean first = true;

    sb.append("blockId:");
    sb.append(this.blockId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("length:");
    sb.append(this.length);
    first = false;
    if (!first) sb.append(", ");
    sb.append("locations:");
    if (this.locations == null) {
      sb.append("null");
    } else {
      sb.append(this.locations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BlockInfoStandardSchemeFactory implements SchemeFactory {
    public BlockInfoStandardScheme getScheme() {
      return new BlockInfoStandardScheme();
    }
  }

  private static class BlockInfoStandardScheme extends StandardScheme<BlockInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BlockInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BLOCK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blockId = iprot.readI64();
              struct.setBlockIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.length = iprot.readI64();
              struct.setLengthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.locations = new ArrayList<BlockLocation>(_list0.size);
                BlockLocation _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new BlockLocation();
                  _elem1.read(iprot);
                  struct.locations.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLocationsIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BlockInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BLOCK_ID_FIELD_DESC);
      oprot.writeI64(struct.blockId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LENGTH_FIELD_DESC);
      oprot.writeI64(struct.length);
      oprot.writeFieldEnd();
      if (struct.locations != null) {
        oprot.writeFieldBegin(LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locations.size()));
          for (BlockLocation _iter3 : struct.locations)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BlockInfoTupleSchemeFactory implements SchemeFactory {
    public BlockInfoTupleScheme getScheme() {
      return new BlockInfoTupleScheme();
    }
  }

  private static class BlockInfoTupleScheme extends TupleScheme<BlockInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BlockInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBlockId()) {
        optionals.set(0);
      }
      if (struct.isSetLength()) {
        optionals.set(1);
      }
      if (struct.isSetLocations()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBlockId()) {
        oprot.writeI64(struct.blockId);
      }
      if (struct.isSetLength()) {
        oprot.writeI64(struct.length);
      }
      if (struct.isSetLocations()) {
        {
          oprot.writeI32(struct.locations.size());
          for (BlockLocation _iter4 : struct.locations)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BlockInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.blockId = iprot.readI64();
        struct.setBlockIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.length = iprot.readI64();
        struct.setLengthIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.locations = new ArrayList<BlockLocation>(_list5.size);
          BlockLocation _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new BlockLocation();
            _elem6.read(iprot);
            struct.locations.add(_elem6);
          }
        }
        struct.setLocationsIsSet(true);
      }
    }
  }

}

