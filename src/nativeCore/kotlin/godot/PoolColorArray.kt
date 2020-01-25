package godot

import gdnative.godot_error
import gdnative.godot_pool_color_array
import kotlinx.cinterop.*

class PoolColorArray(
  value: CValue<godot_pool_color_array>
): Primitive<godot_pool_color_array>(value), Iterable<Color> {
  fun append(color: Color) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_color_array_append)(ptr, color._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolColorArray) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_color_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, color: Color): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_color_array_insert)(ptr, index, color._value.ptr)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_color_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_color_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_color_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  fun set(index: Int, color: Color) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_color_array_set)(ptr, index, color._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun get(index: Int): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_pool_color_array_get)(_value.ptr, index)
      )
    }
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_color_array_size)(_value.ptr)
    }
  }

  override fun toGDString(): GDString {
    return GDString.new("PoolColorArray(${size()})")
  }

  override fun iterator(): Iterator<Color> {
    return IndexedIterator(size(), this::get)
  }

  companion object {
    fun new(): PoolColorArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_color_array>()
        checkNotNull(Godot.gdnative.godot_pool_color_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolColorArray(value)
    }

    fun new(from: GDArray): PoolColorArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_color_array>()
        checkNotNull(Godot.gdnative.godot_pool_color_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolColorArray(value)
    }
  }
}
