// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class CanvasItem(
  _handle: COpaquePointer
) : Node(_handle) {
  var lightMask: Int
    get() {
       return getLightMask() 
    }
    set(value) {
      setLightMask(value)
    }

  var material: Material
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var modulate: Color
    get() {
       return getModulate() 
    }
    set(value) {
      setModulate(value)
    }

  var selfModulate: Color
    get() {
       return getSelfModulate() 
    }
    set(value) {
      setSelfModulate(value)
    }

  var showBehindParent: Boolean
    get() {
       return isDrawBehindParentEnabled() 
    }
    set(value) {
      setDrawBehindParent(value)
    }

  var useParentMaterial: Boolean
    get() {
       return getUseParentMaterial() 
    }
    set(value) {
      setUseParentMaterial(value)
    }

  var visible: Boolean
    get() {
       return isVisible() 
    }
    set(value) {
      setVisible(value)
    }

  /**
   * CanvasItem::draw signal
   */
  val signalDraw: Signal0 = Signal0("draw")

  /**
   * CanvasItem::hide signal
   */
  val signalHide: Signal0 = Signal0("hide")

  /**
   * CanvasItem::item_rect_changed signal
   */
  val signalItemRectChanged: Signal0 = Signal0("item_rect_changed")

  /**
   * CanvasItem::visibility_changed signal
   */
  val signalVisibilityChanged: Signal0 = Signal0("visibility_changed")

  /**
   * Specialized setter for modulate
   */
  fun modulate(cb: Color.() -> Unit) {
    val _p = modulate
    cb(_p)
    modulate = _p
  }

  /**
   * Specialized setter for selfModulate
   */
  fun selfModulate(cb: Color.() -> Unit) {
    val _p = selfModulate
    cb(_p)
    selfModulate = _p
  }

  fun drawArc(
    center: Vector2,
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    pointCount: Int,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(center))
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(startAngle))
    _args.add(Variant.fromAny(endAngle))
    _args.add(Variant.fromAny(pointCount))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawArc.call(this._handle, _args)
  }

  fun drawChar(
    font: Font,
    position: Vector2,
    char: String,
    next: String,
    modulate: Color = Color.rgb(1,1,1,1)
  ): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(font))
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(char))
    _args.add(Variant.fromAny(next))
    _args.add(Variant.fromAny(modulate))
    val _ret = __method_bind.drawChar.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun drawCircle(
    position: Vector2,
    radius: Float,
    color: Color
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(color))
    __method_bind.drawCircle.call(this._handle, _args)
  }

  fun drawColoredPolygon(
    points: PoolVector2Array,
    color: Color,
    uvs: PoolVector2Array,
    texture: Texture,
    normalMap: Texture,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(uvs))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawColoredPolygon.call(this._handle, _args)
  }

  fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawLine.call(this._handle, _args)
  }

  fun drawMesh(
    mesh: Mesh,
    texture: Texture,
    normalMap: Texture,
    transform: Transform2D = Transform2D.new(Vector2.new(1, 0), Vector2.new(0, 1), Vector2.new(0,
        0)),
    modulate: Color = Color.rgb(1,1,1,1)
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(transform))
    _args.add(Variant.fromAny(modulate))
    __method_bind.drawMesh.call(this._handle, _args)
  }

  fun drawMultiline(
    points: PoolVector2Array,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawMultiline.call(this._handle, _args)
  }

  fun drawMultilineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawMultilineColors.call(this._handle, _args)
  }

  fun drawMultimesh(
    multimesh: MultiMesh,
    texture: Texture,
    normalMap: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.drawMultimesh.call(this._handle, _args)
  }

  fun drawPolygon(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture,
    normalMap: Texture,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(uvs))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawPolygon.call(this._handle, _args)
  }

  fun drawPolyline(
    points: PoolVector2Array,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawPolyline.call(this._handle, _args)
  }

  fun drawPolylineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawPolylineColors.call(this._handle, _args)
  }

  fun drawPrimitive(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture,
    width: Float = 1.0f,
    normalMap: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(uvs))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.drawPrimitive.call(this._handle, _args)
  }

  fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(filled))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.drawRect.call(this._handle, _args)
  }

  fun drawSetTransform(
    position: Vector2,
    rotation: Float,
    scale: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(rotation))
    _args.add(Variant.fromAny(scale))
    __method_bind.drawSetTransform.call(this._handle, _args)
  }

  fun drawSetTransformMatrix(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.drawSetTransformMatrix.call(this._handle, listOf(_arg))
  }

  fun drawString(
    font: Font,
    position: Vector2,
    text: String,
    modulate: Color = Color.rgb(1,1,1,1),
    clipW: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(font))
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(text))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(clipW))
    __method_bind.drawString.call(this._handle, _args)
  }

  fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(styleBox))
    _args.add(Variant.fromAny(rect))
    __method_bind.drawStyleBox.call(this._handle, _args)
  }

  fun drawTexture(
    texture: Texture,
    position: Vector2,
    modulate: Color = Color.rgb(1,1,1,1),
    normalMap: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.drawTexture.call(this._handle, _args)
  }

  fun drawTextureRect(
    texture: Texture,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color.rgb(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(tile))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.drawTextureRect.call(this._handle, _args)
  }

  fun drawTextureRectRegion(
    texture: Texture,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color.rgb(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture,
    clipUv: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(srcRect))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(clipUv))
    __method_bind.drawTextureRectRegion.call(this._handle, _args)
  }

  fun forceUpdateTransform() {
    __method_bind.forceUpdateTransform.call(this._handle)
  }

  fun getCanvas(): RID {
    val _ret = __method_bind.getCanvas.call(this._handle)
    return _ret.asRID()
  }

  fun getCanvasItem(): RID {
    val _ret = __method_bind.getCanvasItem.call(this._handle)
    return _ret.asRID()
  }

  fun getCanvasTransform(): Transform2D {
    val _ret = __method_bind.getCanvasTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalMousePosition(): Vector2 {
    val _ret = __method_bind.getGlobalMousePosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getGlobalTransform(): Transform2D {
    val _ret = __method_bind.getGlobalTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalTransformWithCanvas(): Transform2D {
    val _ret = __method_bind.getGlobalTransformWithCanvas.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getLightMask(): Int {
    val _ret = __method_bind.getLightMask.call(this._handle)
    return _ret.asInt()
  }

  fun getLocalMousePosition(): Vector2 {
    val _ret = __method_bind.getLocalMousePosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getModulate(): Color {
    val _ret = __method_bind.getModulate.call(this._handle)
    return _ret.asColor()
  }

  fun getSelfModulate(): Color {
    val _ret = __method_bind.getSelfModulate.call(this._handle)
    return _ret.asColor()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getUseParentMaterial(): Boolean {
    val _ret = __method_bind.getUseParentMaterial.call(this._handle)
    return _ret.asBoolean()
  }

  fun getViewportRect(): Rect2 {
    val _ret = __method_bind.getViewportRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getViewportTransform(): Transform2D {
    val _ret = __method_bind.getViewportTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getWorld2d(): World2D {
    val _ret = __method_bind.getWorld2d.call(this._handle)
    return _ret.asObject(::World2D)!!
  }

  fun hide() {
    __method_bind.hide.call(this._handle)
  }

  fun isDrawBehindParentEnabled(): Boolean {
    val _ret = __method_bind.isDrawBehindParentEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.isLocalTransformNotificationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSetAsToplevel(): Boolean {
    val _ret = __method_bind.isSetAsToplevel.call(this._handle)
    return _ret.asBoolean()
  }

  fun isTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.isTransformNotificationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.isVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVisibleInTree(): Boolean {
    val _ret = __method_bind.isVisibleInTree.call(this._handle)
    return _ret.asBoolean()
  }

  fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.makeCanvasPositionLocal.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun makeInputLocal(event: InputEvent): InputEvent {
    val _arg = Variant.new(event)
    val _ret = __method_bind.makeInputLocal.call(this._handle, listOf(_arg))
    return _ret.asObject(::InputEvent)!!
  }

  fun setAsToplevel(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsToplevel.call(this._handle, listOf(_arg))
  }

  fun setDrawBehindParent(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDrawBehindParent.call(this._handle, listOf(_arg))
  }

  fun setLightMask(lightMask: Int) {
    val _arg = Variant.new(lightMask)
    __method_bind.setLightMask.call(this._handle, listOf(_arg))
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, listOf(_arg))
  }

  fun setModulate(modulate: Color) {
    val _arg = Variant.new(modulate)
    __method_bind.setModulate.call(this._handle, listOf(_arg))
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyLocalTransform.call(this._handle, listOf(_arg))
  }

  fun setNotifyTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyTransform.call(this._handle, listOf(_arg))
  }

  fun setSelfModulate(selfModulate: Color) {
    val _arg = Variant.new(selfModulate)
    __method_bind.setSelfModulate.call(this._handle, listOf(_arg))
  }

  fun setUseParentMaterial(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseParentMaterial.call(this._handle, listOf(_arg))
  }

  fun setVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setVisible.call(this._handle, listOf(_arg))
  }

  fun show() {
    __method_bind.show.call(this._handle)
  }

  fun update() {
    __method_bind.update.call(this._handle)
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4),

    BLEND_MODE_DISABLED(5);

    companion object {
      fun from(value: Int): BlendMode {
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
    val BLEND_MODE_ADD: Int = 1

    val BLEND_MODE_DISABLED: Int = 5

    val BLEND_MODE_MIX: Int = 0

    val BLEND_MODE_MUL: Int = 3

    val BLEND_MODE_PREMULT_ALPHA: Int = 4

    val BLEND_MODE_SUB: Int = 2

    val NOTIFICATION_DRAW: Int = 30

    val NOTIFICATION_ENTER_CANVAS: Int = 32

    val NOTIFICATION_EXIT_CANVAS: Int = 33

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 31

    /**
     * Container for method_bind pointers for CanvasItem
     */
    private object __method_bind {
      val drawArc: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_arc".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_arc" }
        }
      val drawChar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_char".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_char" }
        }
      val drawCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_circle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_circle" }
        }
      val drawColoredPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_colored_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_colored_polygon" }
        }
      val drawLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_line" }
        }
      val drawMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_mesh" }
        }
      val drawMultiline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_multiline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_multiline" }
        }
      val drawMultilineColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_multiline_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_multiline_colors" }
        }
      val drawMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_multimesh" }
        }
      val drawPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_polygon" }
        }
      val drawPolyline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_polyline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_polyline" }
        }
      val drawPolylineColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_polyline_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_polyline_colors" }
        }
      val drawPrimitive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_primitive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_primitive" }
        }
      val drawRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect" }
        }
      val drawSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_set_transform" }
        }
      val drawSetTransformMatrix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_set_transform_matrix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_set_transform_matrix" }
        }
      val drawString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_string" }
        }
      val drawStyleBox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_style_box".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_style_box" }
        }
      val drawTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_texture" }
        }
      val drawTextureRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_texture_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_texture_rect" }
        }
      val drawTextureRectRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_texture_rect_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_texture_rect_region" }
        }
      val forceUpdateTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "force_update_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
        }
      val getCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas" }
        }
      val getCanvasItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_canvas_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_item" }
        }
      val getCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_transform" }
        }
      val getGlobalMousePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_global_mouse_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_mouse_position" }
        }
      val getGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
        }
      val getGlobalTransformWithCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_global_transform_with_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform_with_canvas" }
        }
      val getLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_light_mask" }
        }
      val getLocalMousePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_local_mouse_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_local_mouse_position" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val getModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modulate" }
        }
      val getSelfModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_self_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_self_modulate" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val getUseParentMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_use_parent_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_parent_material" }
        }
      val getViewportRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_viewport_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_rect" }
        }
      val getViewportTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_viewport_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_transform" }
        }
      val getWorld2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_world_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world_2d" }
        }
      val hide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "hide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide" }
        }
      val isDrawBehindParentEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_draw_behind_parent_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_draw_behind_parent_enabled" }
        }
      val isLocalTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_local_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_local_transform_notification_enabled" }
        }
      val isSetAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
        }
      val isTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_transform_notification_enabled"
            }
        }
      val isVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible" }
        }
      val isVisibleInTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_visible_in_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
        }
      val makeCanvasPositionLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "make_canvas_position_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_canvas_position_local" }
        }
      val makeInputLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "make_input_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_input_local" }
        }
      val setAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
        }
      val setDrawBehindParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_draw_behind_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_behind_parent" }
        }
      val setLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_light_mask" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val setModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_modulate" }
        }
      val setNotifyLocalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_notify_local_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
        }
      val setNotifyTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_notify_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
        }
      val setSelfModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_self_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_self_modulate" }
        }
      val setUseParentMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_use_parent_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_parent_material" }
        }
      val setVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible" }
        }
      val show: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "show".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show" }
        }
      val update: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "update".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update" }
        }}
  }
}
