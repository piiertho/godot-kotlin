// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CircleShape2D(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  var radius: Float
    get() {
       return getRadius() 
    }
    set(value) {
      setRadius(value)
    }

  fun getRadius(): Float {
    val _ret = __method_bind.getRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun setRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setRadius.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): CircleShape2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CircleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CircleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CircleShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CircleShape2D = CircleShape2D(ptr)
    /**
     * Container for method_bind pointers for CircleShape2D
     */
    private object __method_bind {
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CircleShape2D".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CircleShape2D".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }}
  }
}
