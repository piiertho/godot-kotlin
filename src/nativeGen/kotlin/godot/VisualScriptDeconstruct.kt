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

open class VisualScriptDeconstruct(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var type: Variant.Type
    get() {
       return getDeconstructType() 
    }
    set(value) {
      setDeconstructType(value.value)
    }

  fun getDeconstructType(): Variant.Type {
    val _ret = __method_bind.getDeconstructType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setDeconstructType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setDeconstructType.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualScriptDeconstruct = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptDeconstruct".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptDeconstruct" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptDeconstruct(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptDeconstruct = VisualScriptDeconstruct(ptr)
    /**
     * Container for method_bind pointers for VisualScriptDeconstruct
     */
    private object __method_bind {
      val getDeconstructType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptDeconstruct".cstr.ptr,
            "get_deconstruct_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_deconstruct_type" }
        }
      val setDeconstructType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptDeconstruct".cstr.ptr,
            "set_deconstruct_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_deconstruct_type" }
        }}
  }
}
