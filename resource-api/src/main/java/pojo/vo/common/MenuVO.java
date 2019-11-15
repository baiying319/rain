package pojo.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单 视图模型
 * @author raojing
 * @date 2019/9/19 21:16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuVO {

    /**
     * 菜单id
     */
    private String id;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单链接
     */
    private String linkPath;

    /**
     * 菜单logo
     */
    private String menulogo;

    /**
     * 子菜单
     */
    private List<MenuVO> menuVOList;

    public static List<MenuVO> buildTree(){
        List<MenuVO> categoryVOList = new ArrayList<>(10);
        MenuVO firstParent = MenuVO.builder()
                .id("1")
                .menuName("资源管理")
                .linkPath("#")
                .build();
        
        List<MenuVO> firstSubList = new ArrayList<>();
        MenuVO firstSubOne = MenuVO.builder()
                .id("11")
                .menuName("首页")
                .linkPath("/admin/resource/index.html")
                .menulogo("layui-icon layui-icon-home")
                .build();
        MenuVO firstSubTwo = MenuVO.builder()
                .id("12")
                .menuName("本地映射地址配置")
                .linkPath("/admin/resource_locations_config/config_list.html")
                .menulogo("layui-icon layui-icon-set")
                .build();
        MenuVO firstSubThree = MenuVO.builder()
                .id("13")
                .menuName("服务列表")
                .linkPath("/admin/resource/serviceList.html")
                .menulogo("layui-icon layui-icon-home")
                .menulogo("layui-icon layui-icon-senior")
                .build();
        
        firstSubList.add(firstSubOne);
        firstSubList.add(firstSubTwo);
        firstSubList.add(firstSubThree);
        firstParent.setMenuVOList(firstSubList);

        categoryVOList.add(firstParent);
        return categoryVOList;
    }

}
