// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeExpression(
  _handle: COpaquePointer
) : VisualShaderNodeGroupBase(_handle) {
  var expression: String
    get() {
       return getExpression() 
    }
    set(value) {
      setExpression(value)
    }

  fun getExpression(): String {
    val _ret = __method_bind.getExpression.call(this._handle)
    return _ret.asString()
  }

  fun setExpression(expression: String) {
    val _arg = Variant.new(expression)
    __method_bind.setExpression.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualShaderNodeExpression = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeExpression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeExpression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeExpression(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeExpression = VisualShaderNodeExpression(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeExpression
     */
    private object __method_bind {
      val getExpression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "get_expression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expression" }
        }
      val setExpression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "set_expression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expression" }
        }}
  }
}
