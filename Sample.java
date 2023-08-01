// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        m = len(image)
        n = len(image[0])
        dirs = [[0,1],[0,-1],[1,0],[-1,0]]
        newColor = color
        oldColor = image[sr][sc]
        if(image==None or len(image)==0): return image
        if image[sr][sc] == newColor: return image
        self.dfs(image,sr,sc,m,n,dirs,newColor,oldColor)
        return image
    
    def dfs(self,image: List[List[int]],r:int,c:int,m:int,n:int,dirs:List[List[int]],newColor: int,oldColor: int):

        #base
        if(r<0 or c<0 or r==m or c==n or image[r][c]!=oldColor): return
        #logic
        image[r][c] = newColor
        for dir in dirs:
            nr = dir[0] + r
            nc = dir[1] + c
            self.dfs(image,nr,nc,m,n,dirs,newColor,oldColor)



// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



  
