import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import {PLANET_LINK} from "@/constants";
const Footer: React.FC = () => {
  const defaultMessage = 'lgy出品';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'planet',
          title: '知识星球',
          href: PLANET_LINK,
          blankTarget: true, //该属性表示点击链接是否打开一个新页面
        },
        {
          key: 'CodeNav',
          title: '编程导航',
          href: 'https://www.code-nav.cn',
          blankTarget: true,
        },
        {
          key: 'github',
          title:<><GithubOutlined />ArvinLi163 GitHub</>,
          href: 'https://github.com/ArvinLi163',
          blankTarget: true,
        },

      ]}
    />
  );
};
export default Footer;
