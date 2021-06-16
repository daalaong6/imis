/**
 * Created by 林佳业 on 2015/2/15.
 */

showSubMenus = function(jsonMenus){//返回一个ul标签即可
    //var myMenu_div = $("<div></div>").attr("class","menu_section").attr("id","#myMenu");
    var ul_list ;
    if(jsonMenus!=null && jsonMenus.length>0){
        var ul_L1 = $("<ul></ul>").attr("class","nav side-menu");//一级菜单ul
        var ul_sub = $("<ul></ul>").attr("class","nav child_menu");//子菜单ul
        for(var i=0;i<jsonMenus.length;i++){
            /*-----------------------公共部分-----------------------*/
            var menu_li=$("<li></li>");
            var url_a = $("<a></a>");
            var text = $("<span></span>");
            var span_down=$("<span></span>").attr("class","fa fa-chevron-down");
            var icon = $("<i></i>");
            if(jsonMenus[i].menuCode!=undefined && jsonMenus[i].menuCode!=""){
                menu_li = menu_li.attr("idVal",jsonMenus[i].menuCode);
            }
            if(jsonMenus[i].objectURL!=undefined && jsonMenus[i].objectURL!=""){
                url_a = url_a.attr("iframeSrc",jsonMenus[i].objectURL);
                if(jsonMenus[i].menuCode!=undefined && jsonMenus[i].menuCode!=""){
                    url_a = url_a.attr("id",jsonMenus[i].menuCode);
                }
            }
            if(jsonMenus[i].menuName!=undefined && jsonMenus[i].menuName!=""){
                text = text.text(jsonMenus[i].menuName);
            }
            if(jsonMenus[i].bitmapName!=undefined && jsonMenus[i].bitmapName!=""){
                icon = icon.attr("class",jsonMenus[i].bitmapName);
            }
            var subMenuList = jsonMenus[i].subMenuList;
            if(subMenuList!=null && subMenuList.length>0){
                var sub_ul=showSubMenus(subMenuList);
                menu_li = menu_li.append(url_a.append(icon,text,span_down),sub_ul);
            }else{//当没有子菜单时,不需要向下的箭头和子菜单ul
                menu_li = menu_li.append(url_a.append(icon,text,$("<span></span>")));
            }
            /*-----------------------公共部分-----------------------*/

            if(jsonMenus[i].menuCode!=null && jsonMenus[i].parentCode==null){//满足一级菜单条件
                /**
                 * 该部分已经抽取到公共部分
                 */
                ul_L1 = ul_L1.append(menu_li);
                ul_list = ul_L1;
            }
            if(jsonMenus[i].menuCode!=null && jsonMenus[i].parentCode!=null){//满足子菜单条件
                /**
                 * 该部分已经抽取到公共部分
                 */
                ul_sub = ul_sub.append(menu_li);
                ul_list = ul_sub;
            }
        }
    }
    return ul_list;
};

