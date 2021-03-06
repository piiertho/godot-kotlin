// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProxyTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  var base: Texture
    get() {
       return getBase() 
    }
    set(value) {
      setBase(value)
    }

  fun getBase(): Texture {
    val _ret = __method_bind.getBase.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun setBase(base: Texture) {
    val _arg = Variant.new(base)
    __method_bind.setBase.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): ProxyTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProxyTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProxyTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProxyTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ProxyTexture = ProxyTexture(ptr)
    /**
     * Container for method_bind pointers for ProxyTexture
     */
    private object __method_bind {
      val getBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProxyTexture".cstr.ptr,
            "get_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base" }
        }
      val setBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProxyTexture".cstr.ptr,
            "set_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base" }
        }}
  }
}
