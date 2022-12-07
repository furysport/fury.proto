//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/libs/bits/types.proto

package tendermint.libs.bits;

@kotlin.jvm.JvmSynthetic
inline fun bitArray(block: tendermint.libs.bits.BitArrayKt.Dsl.() -> Unit): tendermint.libs.bits.Types.BitArray =
  tendermint.libs.bits.BitArrayKt.Dsl._create(tendermint.libs.bits.Types.BitArray.newBuilder()).apply { block() }._build()
object BitArrayKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: tendermint.libs.bits.Types.BitArray.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.libs.bits.Types.BitArray.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.libs.bits.Types.BitArray = _builder.build()

    /**
     * <code>int64 bits = 1;</code>
     */
    var bits: kotlin.Long
      @JvmName("getBits")
      get() = _builder.getBits()
      @JvmName("setBits")
      set(value) {
        _builder.setBits(value)
      }
    /**
     * <code>int64 bits = 1;</code>
     */
    fun clearBits() {
      _builder.clearBits()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ElemsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 elems = 2;</code>
     */
     val elems: com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getElemsList()
      )
    /**
     * <code>repeated uint64 elems = 2;</code>
     * @param value The elems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addElems")
    fun com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>.add(value: kotlin.Long) {
      _builder.addElems(value)
    }/**
     * <code>repeated uint64 elems = 2;</code>
     * @param value The elems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignElems")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 elems = 2;</code>
     * @param values The elems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllElems")
    fun com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllElems(values)
    }/**
     * <code>repeated uint64 elems = 2;</code>
     * @param values The elems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllElems")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 elems = 2;</code>
     * @param index The index to set the value at.
     * @param value The elems to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setElems")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setElems(index, value)
    }/**
     * <code>repeated uint64 elems = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearElems")
    fun com.google.protobuf.kotlin.DslList<kotlin.Long, ElemsProxy>.clear() {
      _builder.clearElems()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun tendermint.libs.bits.Types.BitArray.copy(block: tendermint.libs.bits.BitArrayKt.Dsl.() -> Unit): tendermint.libs.bits.Types.BitArray =
  tendermint.libs.bits.BitArrayKt.Dsl._create(this.toBuilder()).apply { block() }._build()
