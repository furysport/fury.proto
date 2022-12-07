//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryDelegatorValidatorsResponse(block: cosmos.staking.v1beta1.QueryDelegatorValidatorsResponseKt.Dsl.() -> Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse =
  cosmos.staking.v1beta1.QueryDelegatorValidatorsResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse.newBuilder()).apply { block() }._build()
object QueryDelegatorValidatorsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ValidatorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
     val validators: com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getValidatorsList()
      )
    /**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValidators")
    fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>.add(value: cosmos.staking.v1beta1.Staking.Validator) {
      _builder.addValidators(value)
    }/**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValidators")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>.plusAssign(value: cosmos.staking.v1beta1.Staking.Validator) {
      add(value)
    }/**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValidators")
    fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.Validator>) {
      _builder.addAllValidators(values)
    }/**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValidators")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.Validator>) {
      addAll(values)
    }/**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The validators to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValidators")
    operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>.set(index: kotlin.Int, value: cosmos.staking.v1beta1.Staking.Validator) {
      _builder.setValidators(index, value)
    }/**
     * <pre>
     * validators defines the the validators' info of a delegator.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValidators")
    fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValidatorsProxy>.clear() {
      _builder.clearValidators()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse.copy(block: cosmos.staking.v1beta1.QueryDelegatorValidatorsResponseKt.Dsl.() -> Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorsResponse =
  cosmos.staking.v1beta1.QueryDelegatorValidatorsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
