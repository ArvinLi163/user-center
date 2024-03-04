import {PageHeaderWrapper} from '@ant-design/pro-components';
import React from 'react';

const Admin: React.FC = (props) => {
  //子页面
  const {children} = props;
  return (
    <PageHeaderWrapper>
      {children}
    </PageHeaderWrapper>
  );
};
export default Admin;
