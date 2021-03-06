// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeColorOp(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var operator: Operator
    get() {
       return getOperator() 
    }
    set(value) {
      setOperator(value.value)
    }

  fun getOperator(): Operator {
    val _ret = __method_bind.getOperator.call(this._handle)
    return VisualShaderNodeColorOp.Operator.from(_ret.asInt())
  }

  fun setOperator(op: Int) {
    val _arg = Variant.new(op)
    __method_bind.setOperator.call(this._handle, listOf(_arg))
  }

  enum class Operator(
    val value: Int
  ) {
    OP_SCREEN(0),

    OP_DIFFERENCE(1),

    OP_DARKEN(2),

    OP_LIGHTEN(3),

    OP_OVERLAY(4),

    OP_DODGE(5),

    OP_BURN(6),

    OP_SOFT_LIGHT(7),

    OP_HARD_LIGHT(8);

    companion object {
      fun from(value: Int): Operator {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val OP_BURN: Int = 6

    val OP_DARKEN: Int = 2

    val OP_DIFFERENCE: Int = 1

    val OP_DODGE: Int = 5

    val OP_HARD_LIGHT: Int = 8

    val OP_LIGHTEN: Int = 3

    val OP_OVERLAY: Int = 4

    val OP_SCREEN: Int = 0

    val OP_SOFT_LIGHT: Int = 7

    fun new(): VisualShaderNodeColorOp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorOp".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeColorOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeColorOp(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeColorOp = VisualShaderNodeColorOp(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeColorOp
     */
    private object __method_bind {
      val getOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorOp".cstr.ptr,
            "get_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_operator" }
        }
      val setOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorOp".cstr.ptr,
            "set_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_operator" }
        }}
  }
}
