// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamSample(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  var data: PoolByteArray
    get() {
       return getData() 
    }
    set(value) {
      setData(value)
    }

  var format: Format
    get() {
       return getFormat() 
    }
    set(value) {
      setFormat(value.value)
    }

  var loopBegin: Int
    get() {
       return getLoopBegin() 
    }
    set(value) {
      setLoopBegin(value)
    }

  var loopEnd: Int
    get() {
       return getLoopEnd() 
    }
    set(value) {
      setLoopEnd(value)
    }

  var loopMode: LoopMode
    get() {
       return getLoopMode() 
    }
    set(value) {
      setLoopMode(value.value)
    }

  var mixRate: Int
    get() {
       return getMixRate() 
    }
    set(value) {
      setMixRate(value)
    }

  var stereo: Boolean
    get() {
       return isStereo() 
    }
    set(value) {
      setStereo(value)
    }

  /**
   * Specialized setter for data
   */
  fun data(cb: PoolByteArray.() -> Unit) {
    val _p = data
    cb(_p)
    data = _p
  }

  fun getData(): PoolByteArray {
    val _ret = __method_bind.getData.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getFormat(): Format {
    val _ret = __method_bind.getFormat.call(this._handle)
    return AudioStreamSample.Format.from(_ret.asInt())
  }

  fun getLoopBegin(): Int {
    val _ret = __method_bind.getLoopBegin.call(this._handle)
    return _ret.asInt()
  }

  fun getLoopEnd(): Int {
    val _ret = __method_bind.getLoopEnd.call(this._handle)
    return _ret.asInt()
  }

  fun getLoopMode(): LoopMode {
    val _ret = __method_bind.getLoopMode.call(this._handle)
    return AudioStreamSample.LoopMode.from(_ret.asInt())
  }

  fun getMixRate(): Int {
    val _ret = __method_bind.getMixRate.call(this._handle)
    return _ret.asInt()
  }

  fun isStereo(): Boolean {
    val _ret = __method_bind.isStereo.call(this._handle)
    return _ret.asBoolean()
  }

  fun saveToWav(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.saveToWav.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun setData(data: PoolByteArray) {
    val _arg = Variant.new(data)
    __method_bind.setData.call(this._handle, listOf(_arg))
  }

  fun setFormat(format: Int) {
    val _arg = Variant.new(format)
    __method_bind.setFormat.call(this._handle, listOf(_arg))
  }

  fun setLoopBegin(loopBegin: Int) {
    val _arg = Variant.new(loopBegin)
    __method_bind.setLoopBegin.call(this._handle, listOf(_arg))
  }

  fun setLoopEnd(loopEnd: Int) {
    val _arg = Variant.new(loopEnd)
    __method_bind.setLoopEnd.call(this._handle, listOf(_arg))
  }

  fun setLoopMode(loopMode: Int) {
    val _arg = Variant.new(loopMode)
    __method_bind.setLoopMode.call(this._handle, listOf(_arg))
  }

  fun setMixRate(mixRate: Int) {
    val _arg = Variant.new(mixRate)
    __method_bind.setMixRate.call(this._handle, listOf(_arg))
  }

  fun setStereo(stereo: Boolean) {
    val _arg = Variant.new(stereo)
    __method_bind.setStereo.call(this._handle, listOf(_arg))
  }

  enum class LoopMode(
    val value: Int
  ) {
    LOOP_DISABLED(0),

    LOOP_FORWARD(1),

    LOOP_PING_PONG(2),

    LOOP_BACKWARD(3);

    companion object {
      fun from(value: Int): LoopMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Format(
    val value: Int
  ) {
    FORMAT_8_BITS(0),

    FORMAT_16_BITS(1),

    FORMAT_IMA_ADPCM(2);

    companion object {
      fun from(value: Int): Format {
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
    val FORMAT_16_BITS: Int = 1

    val FORMAT_8_BITS: Int = 0

    val FORMAT_IMA_ADPCM: Int = 2

    val LOOP_BACKWARD: Int = 3

    val LOOP_DISABLED: Int = 0

    val LOOP_FORWARD: Int = 1

    val LOOP_PING_PONG: Int = 2

    fun new(): AudioStreamSample = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamSample".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamSample" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamSample(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioStreamSample = AudioStreamSample(ptr)
    /**
     * Container for method_bind pointers for AudioStreamSample
     */
    private object __method_bind {
      val getData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getLoopBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_loop_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_begin" }
        }
      val getLoopEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_loop_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_end" }
        }
      val getLoopMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_loop_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_mode" }
        }
      val getMixRate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
        }
      val isStereo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "is_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stereo" }
        }
      val saveToWav: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "save_to_wav".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_to_wav" }
        }
      val setData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val setFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_format" }
        }
      val setLoopBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_loop_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_begin" }
        }
      val setLoopEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_loop_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_end" }
        }
      val setLoopMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_loop_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_mode" }
        }
      val setMixRate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
        }
      val setStereo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stereo" }
        }}
  }
}
