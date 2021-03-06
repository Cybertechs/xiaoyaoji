package cn.xiaoyaoji.core.plugin;

/**
 * 事件
 *
 * @author zhoujingjie
 * created on 2017/6/22
 */
public enum Event {
    /**
     * 文档类型
     */
    doc,
    /**
     * 文档编辑
     */
    docEdit,
    /**
     * 文档查看
     */
    docView,
    /**
     * 文档导出
     */
    docExport,
    /**
     * 文档导入
     */
    docImport,
    /**
     * 登录
     */
    login,
    /**
     * 项目全局
     */
    projectGlobal
    ;

    public static Event parse(String value) {
        if (value == null) {
            return null;
        }
        for (Event e : Event.values()) {
            if (e.name().equals(value)) {
                return e;
            }
        }
        return null;
    }




    @Override
    public String toString() {
        return this.name();
    }
}
