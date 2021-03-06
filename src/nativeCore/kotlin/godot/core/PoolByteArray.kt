package godot.core

import gdnative.godot_error
import gdnative.godot_pool_byte_array
import kotlinx.cinterop.*

class PoolByteArray(
  value: CValue<godot_pool_byte_array>
) : CoreType<godot_pool_byte_array>(value), Iterable<UByte> {

  fun append(byte: UByte) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_byte_array_append)(ptr, byte)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolByteArray) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_byte_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, byte: UByte): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_byte_array_insert)(ptr, index, byte)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_byte_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_byte_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_byte_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, byte: UByte) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_byte_array_set)(ptr, index, byte)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): UByte {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_byte_array_get)(_value.ptr, index)
    }
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_byte_array_size)(_value.ptr)
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return GDString.new("PoolByteArray(${size()})")
  }

  override fun iterator(): Iterator<UByte> {
    return IndexedIterator(size(), this::get)
  }

  companion object {
    fun new(): PoolByteArray {
      return allocType(::PoolByteArray) {
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new)(it)
      }
    }

    fun new(from: VariantArray): PoolByteArray {
      return allocType(::PoolByteArray) {
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new_with_array)(it, from._value.ptr)
      }
    }
  }
}
