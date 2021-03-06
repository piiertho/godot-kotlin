// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConcavePolygonShape2D(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  var segments: PoolVector2Array
    get() {
       return getSegments() 
    }
    set(value) {
      setSegments(value)
    }

  /**
   * Specialized setter for segments
   */
  fun segments(cb: PoolVector2Array.() -> Unit) {
    val _p = segments
    cb(_p)
    segments = _p
  }

  fun getSegments(): PoolVector2Array {
    val _ret = __method_bind.getSegments.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun setSegments(segments: PoolVector2Array) {
    val _arg = Variant.new(segments)
    __method_bind.setSegments.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): ConcavePolygonShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConcavePolygonShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConcavePolygonShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConcavePolygonShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ConcavePolygonShape2D = ConcavePolygonShape2D(ptr)
    /**
     * Container for method_bind pointers for ConcavePolygonShape2D
     */
    private object __method_bind {
      val getSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConcavePolygonShape2D".cstr.ptr,
            "get_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_segments" }
        }
      val setSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConcavePolygonShape2D".cstr.ptr,
            "set_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_segments" }
        }}
  }
}
